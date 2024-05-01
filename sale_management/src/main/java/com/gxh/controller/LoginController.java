package com.gxh.controller;

import com.gxh.bean.Result;
import com.gxh.bean.User;
import com.gxh.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result loginCheck(@RequestBody User user) {
        User res = loginService.checkLogin(user);
        if (res != null) {
            return Result.success(res);
        }
        else {
            return Result.error("NOT_LOGIN");
        }
    }

}
