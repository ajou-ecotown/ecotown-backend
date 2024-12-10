package com.echotown.dto;

import com.echotown.persistence.entity.Point;
import com.echotown.persistence.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;

@Builder
public record UserInfoResponse(
        @JsonProperty("username")
        String username,
        @JsonProperty("points")
        int points,
        @JsonProperty("user_created_at")
        LocalDate userCreatedAt,
        @JsonProperty("email")
        String email,
        @JsonProperty("activity")
        String activity,
        @JsonProperty("points_created_at")
        LocalDate pointsCreatedAt
) {
    public static UserInfoResponse from(User user, List<Point> points) {
        if (points.isEmpty()) {
            return UserInfoResponse.builder()
                    .username(user.getUserName())
                    .points(0)
                    .userCreatedAt(user.getCreatedAt().toLocalDate())
                    .email(user.getEmail())
                    .activity("최근 활동이 없습니다.")
                    .pointsCreatedAt(user.getCreatedAt().toLocalDate())
                    .build();
        }

        Point latestPoint = points.get(0);
        return UserInfoResponse.builder()
                .username(user.getUserName())
                .points(points.stream().mapToInt(Point::getPoint).sum())
                .userCreatedAt(user.getCreatedAt().toLocalDate())
                .email(user.getEmail())
                .activity(latestPoint.getActivity())
                .pointsCreatedAt(latestPoint.getCreatedAt().toLocalDate())
                .build();

    }
}