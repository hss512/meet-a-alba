package com.project.albamon.user.domain;

import com.project.albamon.user.domain.enums.Role;
import com.project.albamon.user.dto.UserReqDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class User {

    /*
    * jwt, 소셜 로그인 로직으로 수정 예정
    * */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String password;

    private Role role;

    @Builder
    public User(Long userId, String username, String password, Role role){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Builder(builderMethodName = "dtoBuilder")
    public void updateUser(UserReqDto userReqDto){
        this.userId = Long.parseLong(userReqDto.getUserId());
        this.username = userReqDto.getUsername();
        this.password = userReqDto.getPassword();
        this.role = userReqDto.getRole();
    }
}
