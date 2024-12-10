package com.echotown.persistence.repository;

import com.echotown.persistence.entity.LikeOrDislike;
import com.echotown.persistence.entity.Review;
import com.echotown.persistence.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeOrDislikeRepository extends JpaRepository<LikeOrDislike, Long> {
    Optional<LikeOrDislike> findByUserAndReview(User user, Review review);


}
