package com.itheima.Service;


import com.itheima.Dao.mapper;
import com.itheima.domain.ORuser;
import com.itheima.domain.User;
import com.itheima.domain.tb_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private mapper mapper;

    //public ORuser queryUserByid(Long id){

       // return this.mapper.selectByPrimaryKey(id);
   // }
    @Transactional
    public void del(Long id){
        this.mapper.deleteByPrimaryKey(id);
        
    }

    public tb_user queryUserBy(Long id) {
    return this.mapper.selectByPrimaryKey(id);

    }
}
