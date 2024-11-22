package com.response.util.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@SuperBuilder
@NoArgsConstructor
@Data
public class BaseDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private boolean isNew = true;
}
