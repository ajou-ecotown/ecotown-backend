package com.echotown.common.exception;

import lombok.Builder;

@Builder
public record CustomExceptionResponse <T>(
        int statusCode,
        T data
) {
}
