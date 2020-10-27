package com.pojo;

public class User {
    private  Integer id;
    private  String mname;
    private  String num;
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mname='" + mname + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
