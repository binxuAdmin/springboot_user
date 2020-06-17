package com.itheima.service;

import com.itheima.maper.usermapper;
import com.itheima.pijo.tb_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
@Autowired
    private usermapper mapper;
public tb_user queryuserbyid(Long id){
return mapper.selectByPrimaryKey(id);
}
}
