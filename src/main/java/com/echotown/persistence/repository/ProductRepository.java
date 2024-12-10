package com.echotown.persistence.repository;

import static com.echotown.common.exception.CustomExceptionInfo.NULL_BODY_WITH_404;

import com.echotown.common.exception.CustomException;
import com.echotown.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


    default Product getById(Long productId) {
        return this.findById(productId).orElseThrow(
                () -> new CustomException(NULL_BODY_WITH_404, "Product not found")
        );
    }
}
