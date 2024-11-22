package com.response.util.response;

import com.response.util.enums.ResponseType;

public interface ResponseErrorCode extends ResponseCode{
    @Override
    default ResponseType getType() {
        return ResponseType.ERROR;
    }
}
