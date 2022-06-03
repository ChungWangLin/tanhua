package com.jones.tanhua.service;

import com.jones.tanhua.constance.RedisCache;
import com.jones.tanhua.exception.DuplicationException;
import com.jones.tanhua.util.RedisUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class SMSService {

    @Value("${sms.expire}")
    private Integer codeExpire;

    public void sendCode(String phone) {
        String codeKey = RedisCache.SMS_CODE+phone;
        String code = "111111";
        if (null!=RedisUtil.get(codeKey)) {
            log.warn("手机号:{}的验证码:{}还未失效！",phone, code);
            throw new DuplicationException("验证码还未失效，请勿重复发送！");
        }

        int min = codeExpire/60;
        log.info("验证码111111已发送到手机{},有效期{}分钟。",phone,min);
        RedisUtil.set(codeKey, code,codeExpire);
    }

}
