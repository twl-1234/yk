package org.twl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.twl.bean.User;
import org.twl.custom.Result;
import org.twl.custom.ResultCode;

import org.twl.service.impl.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/findAll")
    public String findAllUser(){
//        List<User> allUserByPaging = userService.findAllUserByPaging(0, 5);
//        for (User user : allUserByPaging) System.out.println(user);
        return "123";
    }

    @PostMapping("/insertUser")
    public Result<Void> insertUser(@RequestBody User user){
        System.out.println(user);
        if (userService.insertUser(user)>0){
            return Result.success();
        }else {
           return Result.failure(ResultCode.REQUEST_PARAM_ERROR);
        }
    }
}
