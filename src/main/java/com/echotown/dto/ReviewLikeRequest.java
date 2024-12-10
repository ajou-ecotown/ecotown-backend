package com.echotown.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ReviewLikeRequest(
        @JsonProperty("user_id")
        Long userId,
        @JsonProperty("review_id")
        Long reviewId,
        @JsonProperty("update_like")
        Integer updateLike
) {
}
