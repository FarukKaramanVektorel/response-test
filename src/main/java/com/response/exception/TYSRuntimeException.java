package com.response.exception;

import com.response.util.enums.ResponseErrorCodeEn;
import com.response.util.response.ResponseCode;
import lombok.Getter;
import org.springframework.util.ObjectUtils;

import java.text.MessageFormat;

public class TYSRuntimeException extends RuntimeException implements ResponseStatus{

    private static final long serialVersionUID = 4893615685176866062L;
    @Getter
    private final transient ResponseCode responseCode;
    @Getter
    private final String responseMessage;
    @Getter
    private final String applicationName;

    public TYSRuntimeException() {
        this(ResponseErrorCodeEn.RUNTIME_EXCEPTION);
    }

    public TYSRuntimeException(Exception e) {
        this(e, ResponseErrorCodeEn.RUNTIME_EXCEPTION);
    }

    public TYSRuntimeException(Object... params) {
        this(ResponseErrorCodeEn.RUNTIME_EXCEPTION, params);
    }

    public TYSRuntimeException(ResponseCode responseCode, Object... params) {
        this(null, responseCode, params);
    }

    public TYSRuntimeException(Exception e, ResponseCode responseCode, Object... params) {
        super(e);
        this.responseCode = responseCode;
        String str = e != null ? (":" + e.getMessage()) : "";
        responseMessage = MessageFormat.format(responseCode.getMessage(), params) + str;
        applicationName = ObjectUtils.isEmpty(System.getenv("APP_NAME")) ? "unknown" : System.getenv("APP_NAME");
    }

    @Override
    public String getMessage() {
        return responseMessage;
    }


}
