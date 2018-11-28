package com.baizhi.cmfz.entity;

import lombok.Data;

@Data
public class Admin {
    private String id;
    private String name;
    private String password;

/*    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/

    public Admin() {
        super();
    }

    public Admin(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }

/*    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }*/
}
