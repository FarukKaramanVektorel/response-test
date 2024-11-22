package com.response.util.response;

import com.response.util.enums.ResponseType;

public interface ResponseCode {
    String name();

    String getMessage();
    ResponseType getType();
}
