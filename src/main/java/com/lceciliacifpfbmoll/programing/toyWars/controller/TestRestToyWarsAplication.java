package com.lceciliacifpfbmoll.programing.toyWars.controller;

import org.apache.tomcat.jni.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestToyWarsAplication {
    @GetMapping("/openUserTest")
    public User testOpenUserTest() {
        return new User();
    }

}
