package com.itheima.domain;

import javax.persistence.*;
import java.util.Date;
@Table(name = "tb_user")
public class tb_user {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "username")
    private  String username;
    @Column(name = "password")
    private  String pssword;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "phone")
    private String phone;
    @Column(name = "created")
    private Date created;
    @Column(name = "salt")
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
