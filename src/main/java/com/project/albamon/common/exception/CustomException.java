package com.project.albamon.common.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

    private StatusCode statusCode;

    public CustomException() {
        super();
    }

    public CustomException(StatusCode statusCode){
        super(statusCode.getMessage());
        this.statusCode = statusCode;
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
