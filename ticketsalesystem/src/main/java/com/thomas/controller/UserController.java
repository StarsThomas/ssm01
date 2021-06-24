package com.thomas.controller;


import com.thomas.service.UserService;
import com.thomas.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("select")
    @ResponseBody
    public List selectAll(){
        return userService.selectAll();
    }
}
