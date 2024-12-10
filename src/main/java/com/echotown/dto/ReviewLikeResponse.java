package com.echotown.dto;

import com.echotown.persistence.entity.Review;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record ReviewLikeResponse(
        @JsonProperty("like")
        Integer like,
        @JsonProperty("dislike")
        Integer dislike
) {
    public static ReviewLikeResponse from(Review review) {
        return ReviewLikeResponse.builder()
                .like(review.getLikeCount())
                .dislike(review.getDislikeCount())
                .build();
    }
}
