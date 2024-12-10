package com.echotown.controller.review;

import com.echotown.dto.ReviewCreateRequest;
import com.echotown.dto.ReviewInfoResponse;
import com.echotown.dto.ReviewLikeRequest;
import com.echotown.dto.ReviewLikeResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

@Tag(name = "Review", description = "리뷰 관련 API")
public interface ReviewControllerDocs {

    @Operation(summary = "게시글 리스트 조회", description = "게시글 리스트를 조회합니다.")
    @ApiResponse(responseCode = "200", description = "게시글 리스트 조회 성공", useReturnTypeSchema = true)
    List<ReviewInfoResponse> getReviews();

    @Operation(summary = "게시글 좋아요 누르기", description = "게시글에 좋아요를 누릅니다.")
    @ApiResponse(responseCode = "200", description = "게시글 좋아요 누르기 성공", useReturnTypeSchema = true)
    ReviewLikeResponse likeReview(ReviewLikeRequest request);

    @Operation(summary = "게시글 작성", description = "게시글을 작성합니다.")
    @ApiResponse(responseCode = "200", description = "게시글 작성 성공")
    void writeReview(ReviewCreateRequest request, MultipartFile image);
}
