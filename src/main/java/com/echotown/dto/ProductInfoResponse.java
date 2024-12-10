package com.echotown.dto;

import com.echotown.persistence.entity.Brand;
import com.echotown.persistence.entity.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record ProductInfoResponse(
        @JsonProperty("brand_name")
        String brandName,
        @JsonProperty("esg_rating")
        String esgRating,
        @JsonProperty("brand_description")
        String brandDescription,
        @JsonProperty("certification_name")
        String certificationName,
        @JsonProperty("cert_description")
        String certDescription,
        @JsonProperty("authority")
        String authority,
        @JsonProperty("website")
        String website,
        @JsonProperty("product_image")
        String productImage,
        @JsonProperty("product_name")
        String productName,
        @JsonProperty("category_name")
        String categoryName
) {
    public static ProductInfoResponse from(Product product) {
        return ProductInfoResponse.builder()
                .brandName(product.getBrand().getBrandName())
                .esgRating(product.getBrand().getEsgRating())
                .brandDescription(product.getBrand().getBrandDescription())
                .certificationName(product.getBrand().getCertification().getCertificationName())
                .certDescription(product.getBrand().getCertification().getCertDescription())
                .authority(product.getBrand().getCertification().getAuthority())
                .website(product.getBrand().getWebsite())
                .productImage(product.getProduct_image())
                .productName(product.getProductName())
                .categoryName(product.getCategory().getCategoryName())
                .build();
    }
}