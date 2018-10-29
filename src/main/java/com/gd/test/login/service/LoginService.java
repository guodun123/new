package com.gd.test.login.service;

import com.gd.test.login.model.Login;

public interface LoginService {
    Login insert(Login var1);

    Login update(Login var1);

    void checkPassword(String var1, String var2);

    Login selectByLoginName(String var1);
}

