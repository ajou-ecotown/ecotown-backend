package com.echotown.dto;

import com.echotown.persistence.entity.Brand;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record BrandInfoResponse(
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
        @JsonProperty("brand_image")
        String brandImage
) {
        public static BrandInfoResponse from(Brand brand) {
                return BrandInfoResponse.builder()
                        .brandName(brand.getBrandName())
                        .esgRating(brand.getEsgRating())
                        .brandDescription(brand.getBrandDescription())
                        .certificationName(brand.getCertification().getCertificationName())
                        .certDescription(brand.getCertification().getCertDescription())
                        .authority(brand.getCertification().getAuthority())
                        .website(brand.getWebsite())
                        .brandImage(brand.getBrandImage())
                        .build();
        }
}
