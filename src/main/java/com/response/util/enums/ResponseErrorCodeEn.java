package com.response.util.enums;

import com.response.util.response.ResponseErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseErrorCodeEn implements ResponseErrorCode {

    ERROR("Gerçekleştirdiğiniz işlemde Hata Oluştu !:{0}"),

    RUNTIME_EXCEPTION("Runtime exception:{0}"),

    USER_EXCEPTION("User exception:{0}"),
    USER_BAD_CREDENTIALS_EXCEPTION("User Bad Credentials exception:{0}"),
    USER_CHANGE_PASSWORD_EXCEPTION("User Change Password exception:{0}"),
    USER_IMAGE_NOT_FOUND_EXCEPTION("User Image Not Found exception:{0}"),
    USER_NOT_FOUND_EXCEPTION("User Not Found exception:{0}"),
    USER_PASSWORD_HASH_EXCEPTION("User Password Hash exception:{0}"),
    USER_PHONE_NOT_FOUND_EXCEPTION("User Phone Not Found exception:{0}"),
    USER_AUTH_PARSE_EXCEPTION("Auth Parse exception:{0}"),
    USER_PASSWORD_VALIDATION_EXCEPTION("Password validation exception:{0}"),

    BLACK_LIST_EXCEPTION("Black list exception:{0}"),
    INVALID_RECAPTCHA_EXCEPTION("Invalid recapthca exception:{0}"),
    PARAMETER_VALIDATION_EXCEPTION("Parameter validation exception:{0}"),
    PARAMETER_IS_RESPONSE_DTO("Parameter is instanceof AdaletResponseDto:{0}"),
    RECORD_NOT_FOUND_EXCEPTION("Record not found exception:{0}"),
    UNAVAILABLE_RECAPTCHA_EXCEPTION("Unavailable recaptcha exception:{0}"),
    AUTH_EXCEPTION("Auth exception {0}"),
    INVALID_TOKEN_EXCEPTION("Invalid token exception:{0}"),
    BAD_REQUEST_EXCEPTION("Bad Request exception:{0}"),
    PERMISSION_EXCEPTION("Permission exception:{0}"),
    CONFIG_EXCEPTION("Config exception:{0}"),
    JSON_PROCESSING_EXCEPTION("Json processing exception:{0}"),

    HTTP_NOTFOUND_EXCEPTION("{0} not found at {1}"),

    PROXY_OUTER_EXCEPTION("Outer exception"),
    PROXY_ILLEGAL_ARGUMENT_EXCEPTION("Illegal argument exception:{0}"),
    PROXY_READ_TIMEOUT_EXCEPTION("Read timeout exception:{0}"),
    PROXY_REST_CLIENT_EXCEPTION("Rest client exception:{0}"),
    PROXY_ILLEGAL_STATE_EXCEPTION("Illegal state exception:{0}"),
    PROXY_WEB_SERVICE_CLIENT_EXCEPTION("Web service client exception:{0}"),
    PROXY_WEB_SERVICE_IO_EXCEPTION("Web service IO exception:{0}"),
    PROXY_WEB_SERVICE_TRANSFORMER_EXCEPTION("Web service transformer exception:{0}"),
    PROXY_WEB_SERVICE_TRANSPORT_EXCEPTION("Web service transport exception:{0}"),
    JDBC_EXCEPTION("Jdbc Exception : {0}"),
    JPA_EXCEPTION("Jpa Exception : {0}"),
    RESPONSE_CODE_NOT_FOUND_EXCEPTION("Response Code cannot found on context"),
    REPORT_EXCEPTION("Report could not be generated"),
    REPORTS_FOLDER_NOT_EXIST_EXCEPTION("Resources altında report klasörü bulunmamaktadır."),
    REPORT_NOT_FOUND_EXCEPTION("reports klasöründe {0} raporu bulunamadı."),

    EMPTY_EXCEPTION("{0}");

    private String message;
}
