package com.echotown.common.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
    private final CustomExceptionInfo customExceptionInfo;
    private final String message;

    public CustomException(CustomExceptionInfo customExceptionInfo, String message) {
        super(customExceptionInfo.getData().toString());
        this.customExceptionInfo = customExceptionInfo;
        this.message = message;
    }
}
