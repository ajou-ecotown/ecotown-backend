package com.echotown.persistence.repository;

import static com.echotown.common.exception.CustomExceptionInfo.NULL_BODY_WITH_404;

import com.echotown.common.exception.CustomException;
import com.echotown.persistence.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    default Review getById(Long reviewId) {
        return this.findById(reviewId).orElseThrow(
                () -> new CustomException(NULL_BODY_WITH_404, "Review not found")
        );
    }
}
