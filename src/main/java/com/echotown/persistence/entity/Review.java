package com.echotown.persistence.entity;

import com.echotown.dto.ReviewCreateRequest;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Getter
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "review_image", columnDefinition="TEXT")
    private String reviewImage;

    @Column(name = "like_count")
    private Integer likeCount;

    @Column(name = "dislike_count")
    private Integer dislikeCount;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "product_name")
    private String productName;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "review", cascade = CascadeType.MERGE)
    private final List<LikeOrDislike> likeOrDislikes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Builder
    private Review(Integer rating, String title, String content, String reviewImage, LocalDateTime createdAt, User user,
                   String productName, Integer likeCount, Integer dislikeCount, Product product) {
        this.rating = rating;
        this.title = title;
        this.content = content;
        this.reviewImage = reviewImage;
        this.createdAt = createdAt;
        this.user = user;
        this.product = product;
        this.productName = productName;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
    }

    public static Review write(ReviewCreateRequest request, User user, Product product, String productName,
                               String imageUrl) {
        return Review.builder()
                .rating(request.rating())
                .title(request.title())
                .content(request.content())
                .reviewImage(imageUrl)
                .likeCount(0)
                .dislikeCount(0)
                .user(user)
                .product(product)
                .productName(productName)
                .createdAt(LocalDateTime.now())
                .build();
    }

    public void likeOrDislike(User user, boolean isLike) {
        if (isLike) {
            likeCount++;
        } else {
            dislikeCount++;
        }
        LikeOrDislike likeOrDislike = LikeOrDislike.createLike(user, this, isLike);
        likeOrDislikes.add(likeOrDislike);
    }
}
