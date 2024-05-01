package com.gxh.service.impl;

import com.gxh.bean.User;
import com.gxh.mapper.UserMapper;
import com.gxh.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkLogin(User user) {
        return userMapper.findUserByUsernameAndPassword(user);
    }
}
