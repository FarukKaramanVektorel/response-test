package com.response.util.enums;

import com.response.util.response.ResponseSuccessCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseSuccessCodeEn implements ResponseSuccessCode {
    SUCCESS("İşlem başarıyla gerçekleştirildi!");

    private String message;

}
