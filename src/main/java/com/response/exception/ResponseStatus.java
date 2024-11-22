package com.response.exception;

import com.response.util.enums.ResponseErrorCodeEn;
import com.response.util.response.ResponseCode;

public interface ResponseStatus {
    default String getHttpStatus() {
        return "OK";
    }

    default ResponseCode getResponseStatus() {
        return ResponseErrorCodeEn.ERROR;
    }
}
