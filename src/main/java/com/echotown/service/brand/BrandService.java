package com.echotown.service.brand;

import com.echotown.dto.BrandInfoResponse;
import com.echotown.dto.ProductInfoOfBrandMap;
import com.echotown.dto.ProductInfoResponse;
import com.echotown.persistence.entity.Brand;
import com.echotown.persistence.repository.BrandRepository;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;

    public List<BrandInfoResponse> getEcoBrands() {
        // TODO : ?
        List<Brand> ecoBrands = brandRepository.getEcoBrands();

        return ecoBrands.stream()
                .map(BrandInfoResponse::from)
                .toList();
    }

    public Map<String, List<ProductInfoResponse>> getProductsOfEcoBrands() {
        List<Brand> ecoBrands = brandRepository.getEcoBrands();

        return ecoBrands.stream()
                .collect(Collectors.toMap(
                        Brand::getBrandName,
                        brand -> brand.getProducts().stream()
                                .map(ProductInfoResponse::from)
                                .toList()
                ));
    }
}
