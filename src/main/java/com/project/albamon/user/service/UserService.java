package com.project.albamon.user.service;

import com.project.albamon.user.domain.User;
import com.project.albamon.user.dto.UserReqDto;
import com.project.albamon.user.dto.UserResDto;
import com.project.albamon.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserResDto getUser(String userId) {

        User getUser = userRepository.findByUserId(Long.parseLong(userId));

        return new UserResDto(getUser);
    }

    public UserResDto signupUser(UserReqDto userReqDto) {

        User user = User.builder()
                .userId(Long.parseLong(userReqDto.getUserId()))
                .password(userReqDto.getPassword())
                .username(userReqDto.getUsername())
                .role(userReqDto.getRole())
                .build();

        User saveUser = userRepository.save(user);

        return new UserResDto(saveUser);
    }

    public void updateUser(Long userId, UserReqDto userReqDto) {

        User findUser = userRepository.findByUserId(userId);

        findUser.updateUser(userReqDto);
    }

    public void deleteUser(Long userId) {

        User findUser = userRepository.findByUserId(userId);

        userRepository.delete(findUser);
    }
}
