package com.itheima.Dao;



import com.itheima.domain.ORuser;
import com.itheima.domain.User;
import com.itheima.domain.tb_user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;



@Mapper
//@Component
public interface mapper extends tk.mybatis.mapper.common.Mapper<tb_user> {

}
