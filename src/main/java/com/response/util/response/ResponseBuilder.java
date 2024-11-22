package com.response.util.response;

import com.response.exception.TYSRuntimeException;
import com.response.util.enums.MetaDataKey;
import com.response.util.enums.ResponseErrorCodeEn;
import com.response.util.enums.ResponseSuccessCodeEn;
import com.response.util.enums.ResponseType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.MDC;

import java.text.MessageFormat;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseBuilder {
    public static final ResponseDto SUCCESS;
    public static final ResponseDto ERROR;


    static {
        SUCCESS = builder().responseCode(ResponseSuccessCodeEn.SUCCESS).build();
        ERROR = builder().responseCode(ResponseErrorCodeEn.ERROR).build();
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        public Builder() {
            responseCode(ResponseSuccessCodeEn.SUCCESS);
        }

        private final Map<String, Object> metadata = new LinkedHashMap<>();

        private Object data;

        public Builder data(Object data) {
            if (data instanceof ResponseDto) {
                throw new TYSRuntimeException(ResponseErrorCodeEn.PARAMETER_IS_RESPONSE_DTO);
            }
            this.data = data;
            return this;
        }

        public Builder responseCode(ResponseCode ResponseCode, Object... params) {
            metadata.put(MetaDataKey.FMTY.name(), ResponseCode.getType().name());
            metadata.put(MetaDataKey.FMC.name(), ResponseCode.name());
            metadata.put(MetaDataKey.FMTE.name(), getFormattedMessage(ResponseCode, params));
            metadata.put(MetaDataKey.FMU.name(), getFormattedMessage(ResponseCode, params));
            return this;
        }

        public Builder responseException(TYSRuntimeException exception) {
            metadata.put(MetaDataKey.FMTY.name(), ResponseType.ERROR);
            metadata.put(MetaDataKey.FMC.name(), exception.getResponseCode().name());
            metadata.put(MetaDataKey.FEC.name(), exception.getClass().getName());
            return this;
        }

        public Builder putMetadata(String key, Object value) {
            this.metadata.put(key, value);
            return this;
        }

        public ResponseDto build() {
            return new ResponseDto();
        }

        private String getFormattedMessage(ResponseCode ResponseCode, Object... params) {
            return MessageFormat.format(ResponseCode.getMessage(), params);
        }
    }
}