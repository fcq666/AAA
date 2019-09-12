package com.cq.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者:传奇
 * 包名:com.cq.model
 * 创建时间:2019/7/19 10:39
 */
public class OrderInfo implements Serializable {

    private Integer id;
    private Double money;
    private String userid;
    private String address;
    private Date createTime;

    //...略


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}