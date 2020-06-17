package com.itheima.controller;

import com.itheima.pijo.tb_user;
import com.itheima.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class usercontroller {
@Autowired
    private userService service;
    @GetMapping("{id}")
    @ResponseBody
    public tb_user quiry(@PathVariable("id") Long id){

       return service.queryuserbyid(id);

    }
}
