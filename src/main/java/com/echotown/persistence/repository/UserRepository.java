package com.echotown.persistence.repository;

import static com.echotown.common.exception.CustomExceptionInfo.NULL_BODY_WITH_404;

import com.echotown.common.exception.CustomException;
import com.echotown.persistence.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);

    default User getByEmailAndPassword(String email, String password) {
        return findByEmailAndPassword(email, password).orElseThrow(
                () -> new CustomException(NULL_BODY_WITH_404, "User not found by email and password")
        );
    }

    default User getById(Long userId) {
        return findById(userId).orElseThrow(
                () -> new CustomException(NULL_BODY_WITH_404, "User not found by id")
        );
    }
}