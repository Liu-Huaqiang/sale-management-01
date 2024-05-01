package com.gxh.service;

import com.gxh.bean.User;
import org.springframework.stereotype.Service;

public interface LoginService {
    User checkLogin(User user);
}
