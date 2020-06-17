package com.itheima.user;

import com.itheima.Service.UserService;
import com.itheima.domain.ORuser;
import com.itheima.domain.User;
import com.itheima.domain.tb_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class controller {

    @Autowired
    private UserService service;

    /*@GetMapping("/user")
    @ResponseBody
    public ORuser queryBYid(@RequestParam(name = "id") Long id){
    return this.service.queryUserByid(id);
    }*/

    @GetMapping("{id}")
    @ResponseBody
    public tb_user queryBYII(@PathVariable("id")/*@RequestParam("id")*/ Long id){

        return this.service.queryUserBy(id);
    }



    @GetMapping("/test")
    @ResponseBody
    public String test(){

        return "jello";
    }
}
