package com.ifunq.sfht.backend.admin.dao;

import java.io.Serializable;

/**
 * Created by  Yanghua on
 * Date：2017/3/30 Time：21:38
 * Description:
 */
public class SysAdminDAO implements Serializable {
    private String uid;
    private String username;
    private String password;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username=" + username +
                ", password='" + password + '\'' +
                '}';
    }
}
