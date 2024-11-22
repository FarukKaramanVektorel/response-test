package com.response.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MetaDataKey {
    FMTE,  //FRAMEWORK_MESSAGE_TEXT
    FMTY, // FRAMEWORK_MESSAGE_TYPE
    FMC, // FRAMEWORK_MESSAGE_CODE
    FMU, // FRAMEWORK_MESSAGE_UI
    FEC, // FRAMEWORK_EXCEPTION_CLASS
    FAC, // FRAMEWORK_APP_CREDENTIAL
    FUC, // FRAMEWORK_USER_CREDENTIAL
    PTID, // PARENT TRACE ID
    TID, // TRACE ID
    SID, // SPAN ID
    ESN // EXCEPTION SERVICE NAME
}
