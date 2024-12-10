package com.echotown.controller.user;

import com.echotown.dto.UserInfoResponse;
import com.echotown.dto.UserLoginRequest;
import com.echotown.dto.UserSignUpRequest;
import com.echotown.dto.UserSummaryResponse;
import com.echotown.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserControllerDocs {

    private final UserService userService;

    @PostMapping("/signup")
    public void signup(@RequestBody UserSignUpRequest request) {
        userService.signup(request);
    }

    @PostMapping("/login")
    public UserSummaryResponse login(@RequestBody UserLoginRequest request) {
        return userService.login(request);
    }

    @GetMapping("/users/{userId}")
    public UserInfoResponse getMyInfo(@PathVariable Long userId) {
        return userService.getMyInfo(userId);
    }
}
