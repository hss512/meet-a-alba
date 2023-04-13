package com.project.albamon.common.service;

import com.project.albamon.common.domain.CustomResponse;
import com.project.albamon.common.exception.StatusCode;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {

    public <T> CustomResponse<T> createResponse(T data, StatusCode statusCode){
        return new CustomResponse<>(statusCode.getStatus(), statusCode.getMessage(), data);
    }
}
