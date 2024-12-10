package com.echotown.service.user;

import com.echotown.dto.UserInfoResponse;
import com.echotown.dto.UserLoginRequest;
import com.echotown.dto.UserSignUpRequest;
import com.echotown.dto.UserSummaryResponse;
import com.echotown.persistence.entity.Point;
import com.echotown.persistence.entity.User;
import com.echotown.persistence.repository.PointRepository;
import com.echotown.persistence.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PointRepository pointRepository;

    public void signup(UserSignUpRequest request) {
        User user = User.signUp(request);
        userRepository.save(user);
    }


    public UserSummaryResponse login(UserLoginRequest request) {
        User user = userRepository.getByEmailAndPassword(request.email(), request.password());
        return UserSummaryResponse.from(user);
    }

    public UserInfoResponse getMyInfo(Long userId) {
        User user = userRepository.getById(userId);
        List<Point> points = pointRepository.getPointsByUser(user);

        return UserInfoResponse.from(user, points);
    }
}
