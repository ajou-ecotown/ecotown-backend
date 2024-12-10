package com.echotown.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.multipart.MultipartFile;

public record ReviewCreateRequest(
        @JsonProperty("user_id")
        Long userId,
        @JsonProperty("email")
        String email,
        @JsonProperty("rating")
        int rating,
        @JsonProperty("product_id")
        Long productId,
        @JsonProperty("title")
        String title,
        @JsonProperty("content")
        String content,
        @JsonProperty("product_name")
        String productName,
        @JsonProperty("brand_name")
        String brandName,
        @JsonProperty("category_name")
        String categoryName
) {
}