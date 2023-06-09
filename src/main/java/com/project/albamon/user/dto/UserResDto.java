package com.project.albamon.user.dto;

import com.project.albamon.user.domain.User;
import com.project.albamon.user.domain.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserResDto {

    private Long id;

    private String username;

    private Role role;

    public UserResDto(User user){
        this.id = user.getId();
        this.username = user.getUsername();
        this.role = user.getRole();
    }
}
