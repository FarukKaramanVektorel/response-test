package com.response.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseType {
    ERROR,
    INFO,
    WARN,
    SUCCESS
}
