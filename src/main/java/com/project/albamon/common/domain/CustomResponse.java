package com.project.albamon.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponse <T>{

    private int status;

    private String code;

    private T data;
}
