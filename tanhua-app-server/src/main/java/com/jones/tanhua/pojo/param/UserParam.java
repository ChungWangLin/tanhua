package com.jones.tanhua.pojo.param;

import lombok.Data;

@Data
public class UserParam {

    @Data
    public static class SendCode {
        public String phone;
    }
}
