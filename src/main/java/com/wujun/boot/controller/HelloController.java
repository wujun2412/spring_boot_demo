package com.wujun.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jun.Wu
 * @Date: 2021/1/18 10:53
 * @Description:
 */
@RestController("/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello world";
    }
}
