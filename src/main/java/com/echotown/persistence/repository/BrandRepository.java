package com.echotown.persistence.repository;

import static com.echotown.common.exception.CustomExceptionInfo.NULL_BODY_WITH_404;

import com.echotown.common.exception.CustomException;
import com.echotown.persistence.entity.Brand;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    Optional<Brand> findByBrandName(String brandName);

    default Brand getByName(String brandName) {
        return this.findByBrandName(brandName).orElseThrow(
                () -> new CustomException(NULL_BODY_WITH_404, "Brand not found")
        );
    }

    default List<Brand> getEcoBrands() {
        return this.findAll();
    }

}
