package com.echotown.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Getter
@Table(name = "like_or_dislike")
public class LikeOrDislike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_or_dislike_id")
    private Long likeOrDislikeId;

    @Column(name = "is_like")
    private Boolean isLike;

    @Column(name = "is_dislike")
    private Boolean isDislike;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(name = "review_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;

    @Builder
    private LikeOrDislike(Boolean isLike, Boolean isDislike, User user, Review review) {
        this.isLike = isLike;
        this.isDislike = isDislike;
        this.user = user;
        this.review = review;
    }

    public static LikeOrDislike createLike(User user, Review review, boolean isLike) {
        return LikeOrDislike.builder()
                .isLike(isLike)
                .isDislike(!isLike)
                .user(user)
                .review(review)
                .build();
    }
}
