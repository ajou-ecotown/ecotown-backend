package com.echotown.dto;

import com.echotown.persistence.entity.LikeOrDislike;
import com.echotown.persistence.entity.Review;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;

@Builder
public record ReviewInfoResponse(
        @JsonProperty("username")
        String userName,
        @JsonProperty("created_at")
        LocalDate createdAt,
        @JsonProperty("rating")
        Integer rating,
        @JsonProperty("title")
        String title,
        @JsonProperty("content")
        String content,
        @JsonProperty("review_image")
        String reviewImage,
        @JsonProperty("review_id")
        Long reviewId,
        @JsonProperty("like")
        Integer like,
        @JsonProperty("dislike")
        Integer dislike,
        @JsonProperty("review_name")
        String reviewName,
        @JsonProperty("brand_name")
        String brandName,
        @JsonProperty("category_name")
        String categoryName,
        @JsonProperty("esg_rating")
        String esgRating,
        @JsonProperty("certification_name")
        String certificationName,
        @JsonProperty("like_list")
        List<Integer> like_list,
        @JsonProperty("dislike_list")
        List<Integer> dislike_list
) {
        public static ReviewInfoResponse from(Review review, List<LikeOrDislike> likeOrDislikes) {
                return ReviewInfoResponse.builder()
                        .userName(review.getUser().getUserName())
                        .createdAt(review.getCreatedAt().toLocalDate())
                        .rating(review.getRating())
                        .title(review.getTitle())
                        .content(review.getContent())
                        .reviewImage(review.getReviewImage())
                        .reviewId(review.getReviewId())
                        .like(review.getLikeCount())
                        .dislike(review.getDislikeCount())
                        .reviewName(review.getProduct().getProductName())
                        .brandName(review.getProduct().getBrand().getBrandName())
                        .categoryName(review.getProduct().getCategory().getCategoryName())
                        .esgRating(review.getProduct().getBrand().getEsgRating())
                        .certificationName(review.getProduct().getBrand().getCertification().getCertificationName())
                        .like_list(likeOrDislikes.stream()
                                .filter(e -> e.getReview().getReviewId().equals(review.getReviewId()))
                                .filter(e -> e.getIsLike())
                                .map(e -> e.getUser().getUserId().intValue())
                                .toList())
                        .dislike_list(likeOrDislikes.stream()
                                .filter(e -> e.getReview().getReviewId().equals(review.getReviewId()))
                                .filter(e -> e.getIsDislike())
                                .map(e -> e.getUser().getUserId().intValue())
                                .toList())
                        .build();
        }
}
