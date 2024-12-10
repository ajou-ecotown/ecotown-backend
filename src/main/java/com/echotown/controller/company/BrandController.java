package com.echotown.controller.company;

import com.echotown.dto.BrandInfoResponse;
import com.echotown.dto.ProductInfoOfBrandMap;
import com.echotown.dto.ProductInfoResponse;
import com.echotown.service.brand.BrandService;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BrandController implements BrandControllerDocs {

    private final BrandService brandService;

    @GetMapping("/brands/list")
    public List<BrandInfoResponse> getBrands() {
        return brandService.getEcoBrands();
    }

    @GetMapping("/promotion/list")
    public Map<String, List<ProductInfoResponse>> getProducts() {
        return brandService.getProductsOfEcoBrands();
    }
}
