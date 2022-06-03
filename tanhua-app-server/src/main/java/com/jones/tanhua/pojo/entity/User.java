package com.jones.tanhua.pojo.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String address;
    private LocalDateTime birthday;
}
