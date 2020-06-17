package com.itheima.client;

import com.itheima.pojo.tb_user;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "cn-itcast-pr",fallback =Userclientimpl.class)

public interface Userclient {


    @GetMapping("user/{id}")
    public tb_user quiry(@PathVariable("id") Long id);
}
