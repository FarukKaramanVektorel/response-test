package com.response.util.response;

import com.response.util.enums.ResponseType;

public interface ResponseSuccessCode extends ResponseCode{
    @Override
    default ResponseType getType() {
        return ResponseType.SUCCESS;
    }
}
