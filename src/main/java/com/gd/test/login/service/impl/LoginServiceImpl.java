package com.gd.test.login.service.impl;

import com.gd.test.login.dao.LoginDAO;
import com.gd.test.login.model.Login;
import com.gd.test.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoginServiceImpl implements LoginService {
   /* @Autowired
    private LoginDAO loginDAO;*/

    @Override
    public Login insert(Login login) {
        //loginDAO.insert(login);
        return login;
    }

    @Override
    public Login update(Login login) {
        // loginDAO.update(login);
        return login;
    }

    @Override
    public void checkPassword(String loginName, String password) {
        /*Login login = this.selectByLoginName(loginName);
        if (password.equals(login.getPassword())) {
        }*/
        System.out.println(22);

    }

    @Override
    public Login selectByLoginName(String loginName) {
        Login login = new Login();
        login.setLoginName(loginName);
        List<Login> loginList =new ArrayList<>();// loginDAO.selectByContion(login);
        return !loginList.isEmpty() ? (Login)loginList.get(0) : null;
    }
}
