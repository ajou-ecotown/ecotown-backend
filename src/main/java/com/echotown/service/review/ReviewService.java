package com.echotown.service.review;

import static com.echotown.common.exception.CustomExceptionInfo.NULL_BODY_WITH_404;

import com.echotown.common.exception.CustomException;
import com.echotown.dto.ReviewCreateRequest;
import com.echotown.dto.ReviewInfoResponse;
import com.echotown.dto.ReviewLikeRequest;
import com.echotown.dto.ReviewLikeResponse;
import com.echotown.persistence.entity.Category;
import com.echotown.persistence.entity.LikeOrDislike;
import com.echotown.persistence.entity.Point;
import com.echotown.persistence.entity.Product;
import com.echotown.persistence.entity.Review;
import com.echotown.persistence.entity.User;
import com.echotown.persistence.repository.CategoryRepository;
import com.echotown.persistence.repository.LikeOrDislikeRepository;
import com.echotown.persistence.repository.PointRepository;
import com.echotown.persistence.repository.ProductRepository;
import com.echotown.persistence.repository.ReviewRepository;
import com.echotown.persistence.repository.UserRepository;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final PointRepository pointRepository;
    private final LikeOrDislikeRepository likeOrDislikeRepository;

    public List<ReviewInfoResponse> getReviews() {
        List<Review> reviews = reviewRepository.findAll();
        List<LikeOrDislike> likeOrDislikes = likeOrDislikeRepository.findAll();


        return reviews.stream()
                .map( r -> ReviewInfoResponse.from(r, likeOrDislikes))
                .sorted((r1, r2) -> r2.createdAt().compareTo(r1.createdAt()))
                .toList();
    }

    @Transactional
    public ReviewLikeResponse likeReview(ReviewLikeRequest request) {
        Review review = reviewRepository.getById(request.reviewId());
        User user = userRepository.getById(request.userId());

        likeOrDislikeRepository.findByUserAndReview(user, review)
                .ifPresent(e -> {
                    throw new CustomException(NULL_BODY_WITH_404, "duplicate like");
                });

//        System.out.println("request.updateLike() = " + request.updateLike());
        boolean isLike = request.updateLike() == 1;
//        System.out.println("isLike = " + isLike);

        review.likeOrDislike(user, isLike);
        reviewRepository.save(review);

        return ReviewLikeResponse.from(review);
    }

    @Transactional
    public void writeReview(ReviewCreateRequest request, MultipartFile image) {
        User user = userRepository.getById(request.userId());
        Category category = categoryRepository.getByName(request.categoryName());
        Product product = productRepository.getById(request.productId());

        String imageUrl = saveImageToFileSystem(image);

        Review review = Review.write(request, user, product, request.productName(), imageUrl);
        reviewRepository.save(review);

        Point point = Point.create(user, request.title(), 500);
        pointRepository.save(point);
    }


    private String saveImageToFileSystem(MultipartFile file) {
        if (file == null || file.isEmpty()) {
            return null; // 이미지가 없을 경우 처리
        }

        try {
            // 절대 경로 설정
            String uploadsDir = "/Users/hyunzzi/workspace/ajou/4-1/Database/images/";
            Path uploadPath = Paths.get(uploadsDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath); // 디렉토리가 없으면 생성
            }

            // 파일명 생성 및 저장
            String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
            Path filePath = uploadPath.resolve(fileName);
            file.transferTo(filePath.toFile());

            // URL 생성 (절대 경로 반환)
            return filePath.toAbsolutePath().toString();
        } catch (IOException e) {
            throw new RuntimeException("이미지 저장 실패", e);
        }
    }
}
