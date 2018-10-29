package com.gd.test.login.dao;

import com.gd.test.login.model.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.*;
public interface LoginDAO {
    List<Login> selectByContion(Login var1);

    int deleteByIds(Collection<Long> var1);

    int deleteByIds(@Param("list") Collection<Long> var1, @Param("updatedBy") long var2, @Param("updateTime") Date var4);

    int removeByIds(Collection<Long> var1);

    int insert(Login var1);

    int update(Login var1);
}
