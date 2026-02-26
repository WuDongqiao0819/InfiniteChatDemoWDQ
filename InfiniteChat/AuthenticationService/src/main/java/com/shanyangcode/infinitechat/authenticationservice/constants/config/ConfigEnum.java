package com.shanyangcode.infinitechat.authenticationservice.constants.config;

import lombok.Getter;

@Getter
public enum ConfigEnum {
    SMS_ACCESS_KEY_ID("smsAccessKeyId", "MyAccessKeyId"),
    SMS_ACCESS_KEY_SECRET("smsAccessKeySecret","MyAccessKeySecret"),
    SMS_SIG_NAME("smsSigName","无夕教育科技"),
    SMS_TEMPLATE_CODE("smsTemplateCode","SMS_471490089"),
    TOKEN_SECRET_KEY("tokenSecretKey","goat");


    private final String value;
    private final String text;

    ConfigEnum(String text, String value){
        this.text = text;
        this.value = value;
    }
}