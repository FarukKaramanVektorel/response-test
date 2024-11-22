package com.response.util.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.response.util.enums.MetaDataKey;
import com.response.util.enums.ResponseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> extends BaseDto {
    private T data;

    private Map<String, Object> metadata;

    @JsonIgnore
    public boolean isSuccess() {
        return this.metadata.get(MetaDataKey.FMTY.name()).equals(ResponseType.SUCCESS.name());
    }
}
