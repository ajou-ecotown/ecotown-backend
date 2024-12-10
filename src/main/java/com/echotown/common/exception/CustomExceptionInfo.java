package com.echotown.common.exception;

import java.util.List;
import lombok.Getter;

@Getter
public enum CustomExceptionInfo {

    NULL_BODY_WITH_404("{}", 404),
    LIST_BODY_WITH_404("[]", 404),
    NULL_BODY_WITH_400("{}", 400),
    ;

    private final int statusCode;
    private final Object data;

    CustomExceptionInfo(Object data, int statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }
}
