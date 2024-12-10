package com.echotown.persistence.repository;

import com.echotown.persistence.entity.Category;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByCategoryName(String categoryName);

    default Category getByName(String categoryName) {
        return this.findByCategoryName(categoryName).orElse(null);
    }
}
