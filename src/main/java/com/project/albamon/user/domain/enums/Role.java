package com.project.albamon.user.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    STAFF("staff"),
    MANAGER("manager");

    private final String value;

    @JsonCreator
    public static Role from(String sub) {
        for (Role role : Role.values()) {
            if (role.getValue().equals(sub)) {
                return role;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
