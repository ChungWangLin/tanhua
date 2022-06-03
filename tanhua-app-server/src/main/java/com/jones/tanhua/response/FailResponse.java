package com.jones.tanhua.response;

import lombok.Data;

@Data
public class FailResponse {
    private String code;
    private String message;

    public FailResponse() {
    }

    public FailResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
