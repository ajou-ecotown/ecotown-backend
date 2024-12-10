package com.echotown.dto;

import java.util.List;
import java.util.Map;
import lombok.Builder;

@Builder
public record ProductInfoOfBrandMap(
        Map<String, List<ProductInfoResponse>> brandProducts
) {
    public static ProductInfoOfBrandMap from(Map<String, List<ProductInfoResponse>> brandProducts) {
        return ProductInfoOfBrandMap.builder()
                .brandProducts(brandProducts)
                .build();
    }
}
