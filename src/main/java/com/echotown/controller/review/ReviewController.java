package com.echotown.controller.review;

import com.echotown.dto.ReviewCreateRequest;
import com.echotown.dto.ReviewInfoResponse;
import com.echotown.dto.ReviewLikeRequest;
import com.echotown.dto.ReviewLikeResponse;
import com.echotown.service.review.ReviewService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class ReviewController implements ReviewControllerDocs{

    private final ReviewService reviewService;

    @GetMapping("/reviews/list")
    public List<ReviewInfoResponse> getReviews() {
        return reviewService.getReviews();
    }

    @PostMapping("/reviews/like")
    public ReviewLikeResponse likeReview(@RequestBody ReviewLikeRequest request) {
        return reviewService.likeReview(request);
    }

    @PostMapping(value = "/reviews/write", consumes = "multipart/form-data")
    public void writeReview(@RequestPart("review") ReviewCreateRequest request,
                            @RequestPart("review_image") MultipartFile image) {
        reviewService.writeReview(request, image);
    }
}
