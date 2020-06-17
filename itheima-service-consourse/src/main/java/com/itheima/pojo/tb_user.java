package com.itheima.pojo;

import java.util.Date;


public class tb_user {


    private Integer id;

    private  String username;

    private  String pssword;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    private Date created;

    private String salt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPssword() {
        return pssword;
    }

    public void setPssword(String pssword) {
        this.pssword = pssword;
    }


    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
