package com.bob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bob.utils.RedisOperator;

@RestController
public class BasicController {
    @Autowired
    public RedisOperator redis;
    public static final String USER_REDIS_SESSION="user-redis-session";
}
