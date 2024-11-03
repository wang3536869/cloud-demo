package com.wang.pojo;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @TableName r_user
 */
public class RUser implements Serializable {
    private Long userId;

    private String name;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;

    private String avatar;

    private Integer status;

    private List<Orders> userOrders;
    @Serial
    private static final long serialVersionUID = 1L;

    public RUser(){

    }

    public RUser(Long userId, String name, String password, String phone, String sex, String idNumber, String avatar, Integer status,List<Orders> userOrders) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.idNumber = idNumber;
        this.avatar = avatar;
        this.status = status;
        this.userOrders=userOrders;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Orders> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(List<Orders> userOrders) {
        this.userOrders = userOrders;
    }

    @Override
    public String toString() {
        return "RUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", avatar='" + avatar + '\'' +
                ", status=" + status +
                ", userOrders=" + userOrders +
                '}';
    }
}