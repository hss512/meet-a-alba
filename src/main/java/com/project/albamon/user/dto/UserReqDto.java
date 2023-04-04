package com.project.albamon.user.dto;

import com.project.albamon.user.domain.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserReqDto {

    private Long userId;

    private String username;

    private String password;

    private Role role;

    private String tags;
}
