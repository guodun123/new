package com.gd.test.login.controller;

import com.gd.test.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"login"})
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping({"login"})
    public void login(String loginName, String password) {
        loginService.checkPassword(loginName, password);
    }
}