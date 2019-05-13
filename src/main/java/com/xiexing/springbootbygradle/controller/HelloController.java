package com.xiexing.springbootbygradle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2019/5/10 17:04
 * @author: oswizar
 * @description:
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/gradleTest")
    public String gradleTest() {
        log.info("88888888888888888888888888888888888888888888");
        return "http gradleTest";
    }
}
