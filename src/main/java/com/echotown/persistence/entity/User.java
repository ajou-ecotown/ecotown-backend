package com.echotown.persistence.entity;

import com.echotown.dto.UserSignUpRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Getter
@Table(name = "\"users\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user")
    private List<LikeOrDislike> likeOrDislikes;

    @Builder
    private User(LocalDateTime createdAt, String email, String password, String userName) {
        this.createdAt = createdAt;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }

    public static User signUp(UserSignUpRequest request) {
        return User.builder()
                .userName(request.username())
                .email(request.email())
                .password(request.password())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
