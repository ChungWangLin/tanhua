package com.jones.tanhua.controller;

import com.jones.tanhua.pojo.param.UserParam;
import com.jones.tanhua.service.SMSService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RequiredArgsConstructor
@RestController
public class UserController {
    private final SMSService SMSservice;

    @PostMapping("/user/sendCode")
    public void senCode(@RequestBody UserParam.SendCode phone) {
        SMSservice.sendCode(phone.getPhone());
    }
}
