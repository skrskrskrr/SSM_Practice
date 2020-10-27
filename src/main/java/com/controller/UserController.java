package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.User;
import com.service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
   @RequestMapping("show")
    public String show(){

      List<User> users= userService.selectall();

       return "show";
   }
}
