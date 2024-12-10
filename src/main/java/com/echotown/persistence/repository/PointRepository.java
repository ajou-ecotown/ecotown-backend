package com.echotown.persistence.repository;

import com.echotown.persistence.entity.Point;
import com.echotown.persistence.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Long> {

    List<Point> findAllByUser(User user);

    default List<Point> getPointsByUser(User user) {
        return this.findAllByUser(user).stream()
                .sorted((p1, p2) -> p2.getCreatedAt().compareTo(p1.getCreatedAt()))
                .toList();
    }

}
