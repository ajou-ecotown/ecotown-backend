package com.echotown.dto;

import com.echotown.persistence.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record UserSummaryResponse(
        @JsonProperty("email")
        String email,
        @JsonProperty("username")
        String userName,
        @JsonProperty("user_id")
        Long userId
) {
    public static UserSummaryResponse from(User user) {
        return UserSummaryResponse.builder()
                .email(user.getEmail())
                .userName(user.getUserName())
                .userId(user.getUserId())
                .build();
    }
}
