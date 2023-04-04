package com.project.albamon.user.domain;

import com.project.albamon.user.domain.enums.Role;
import com.project.albamon.user.dto.UserReqDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class User {

    /*
    * jwt, 소셜 로그인 로직으로 수정 예정
    * */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;

    private String password;

    private Role role;

    private String tags;

    @Builder
    public User(Long id, String username, String password, Role role, String tags){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.tags = tags;
    }

    @Builder(builderMethodName = "dtoBuilder")
    public void updateUser(UserReqDto userReqDto){
        this.id = userReqDto.getUserId();
        this.username = userReqDto.getUsername();
        this.password = userReqDto.getPassword();
        this.role = userReqDto.getRole();
        this.tags = userReqDto.getTags();
    }
}
