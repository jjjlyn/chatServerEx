package com.toyed.project.chatServerEx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/")
public class charSvrController {

    @GetMapping(value = "/login")
    public String LoginController(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "hello world";
    }

}
