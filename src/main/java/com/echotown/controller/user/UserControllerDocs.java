package com.echotown.controller.user;

import com.echotown.dto.UserInfoResponse;
import com.echotown.dto.UserLoginRequest;
import com.echotown.dto.UserSignUpRequest;
import com.echotown.dto.UserSummaryResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Tag(name = "Auth", description = "회원가입 및 로그인 관련 API")
public interface UserControllerDocs {

    @Operation(summary = "회원가입", description = "회원가입을 진행합니다.")
    @ApiResponse(responseCode = "200", description = "회원가입 성공")
    void signup(UserSignUpRequest request);

    @Operation(summary = "로그인", description = "로그인을 진행합니다.")
    @ApiResponse(responseCode = "200", description = "로그인 성공", useReturnTypeSchema = true)
    UserSummaryResponse login(UserLoginRequest request);


    @Operation(summary = "내 정보 조회", description = "내 정보를 조회합니다.")
    @ApiResponse(responseCode = "200", description = "내 정보 조회 성공", useReturnTypeSchema = true)
    UserInfoResponse getMyInfo(Long userId);
}