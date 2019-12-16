package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

/**
 * 房屋信息 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:45:14.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class House extends DataPacket {

    //房屋Id.
    private int house_id;
    //用户Id.
    private int user_id;
    //负责人Id.
    private int admin_id;
    //房屋标题.
    private String house_title;
    //每月租金.
    private double house_rent;
    //押金.
    private double house_pledge;
    //交租周期.
    private int house_months;
    //地址.
    private String house_address;
    //房型.
    private String house_shape;
    //朝向.
    private String house_direction;
    //面积.
    private String house_area;
    //楼层.
    private String house_floor;
    //房屋介绍.
    private String house_detail;
    //经纬度.
    private String house_jwd;
    //是否已租.
    private String house_isRented;

    /**
     * 获取 房屋Id.
     * @return 房屋Id.
     */
    public int gethouse_id() {
        return house_id;
    }

    /**
     * 设置房屋Id.
     * @param house_id 房屋Id.
     */
    public void sethouse_id(int house_id) {
        this.house_id = house_id;
    }

    /**
     * 获取 用户Id.
     * @return 用户Id.
     */
    public int getuser_id() {
        return user_id;
    }

    /**
     * 设置用户Id.
     * @param user_id 用户Id.
     */
    public void setuser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * 获取 负责人Id.
     * @return 负责人Id.
     */
    public int getadmin_id() {
        return admin_id;
    }

    /**
     * 设置负责人Id.
     * @param admin_id 负责人Id.
     */
    public void setadmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    /**
     * 获取 房屋标题.
     * @return 房屋标题.
     */
    public String gethouse_title() {
        return house_title;
    }

    /**
     * 设置房屋标题.
     * @param house_title 房屋标题.
     */
    public void sethouse_title(String house_title) {
        this.house_title = house_title;
    }

    /**
     * 获取 每月租金.
     * @return 每月租金.
     */
    public double gethouse_rent() {
        return house_rent;
    }

    /**
     * 设置每月租金.
     * @param house_rent 每月租金.
     */
    public void sethouse_rent(double house_rent) {
        this.house_rent = house_rent;
    }

    /**
     * 获取 押金.
     * @return 押金.
     */
    public double gethouse_pledge() {
        return house_pledge;
    }

    /**
     * 设置押金.
     * @param house_pledge 押金.
     */
    public void sethouse_pledge(double house_pledge) {
        this.house_pledge = house_pledge;
    }

    /**
     * 获取 交租周期.
     * @return 交租周期.
     */
    public int gethouse_months() {
        return house_months;
    }

    /**
     * 设置交租周期.
     * @param house_months 交租周期.
     */
    public void sethouse_months(int house_months) {
        this.house_months = house_months;
    }

    /**
     * 获取 地址.
     * @return 地址.
     */
    public String gethouse_address() {
        return house_address;
    }

    /**
     * 设置地址.
     * @param house_address 地址.
     */
    public void sethouse_address(String house_address) {
        this.house_address = house_address;
    }

    /**
     * 获取 房型.
     * @return 房型.
     */
    public String gethouse_shape() {
        return house_shape;
    }

    /**
     * 设置房型.
     * @param house_shape 房型.
     */
    public void sethouse_shape(String house_shape) {
        this.house_shape = house_shape;
    }

    /**
     * 获取 朝向.
     * @return 朝向.
     */
    public String gethouse_direction() {
        return house_direction;
    }

    /**
     * 设置朝向.
     * @param house_direction 朝向.
     */
    public void sethouse_direction(String house_direction) {
        this.house_direction = house_direction;
    }

    /**
     * 获取 面积.
     * @return 面积.
     */
    public String gethouse_area() {
        return house_area;
    }

    /**
     * 设置面积.
     * @param house_area 面积.
     */
    public void sethouse_area(String house_area) {
        this.house_area = house_area;
    }

    /**
     * 获取 楼层.
     * @return 楼层.
     */
    public String gethouse_floor() {
        return house_floor;
    }

    /**
     * 设置楼层.
     * @param house_floor 楼层.
     */
    public void sethouse_floor(String house_floor) {
        this.house_floor = house_floor;
    }

    /**
     * 获取 房屋介绍.
     * @return 房屋介绍.
     */
    public String gethouse_detail() {
        return house_detail;
    }

    /**
     * 设置房屋介绍.
     * @param house_detail 房屋介绍.
     */
    public void sethouse_detail(String house_detail) {
        this.house_detail = house_detail;
    }

    /**
     * 获取 经纬度.
     * @return 经纬度.
     */
    public String gethouse_jwd() {
        return house_jwd;
    }

    /**
     * 设置经纬度.
     * @param house_jwd 经纬度.
     */
    public void sethouse_jwd(String house_jwd) {
        this.house_jwd = house_jwd;
    }

    /**
     * 获取 是否已租.
     * @return 是否已租.
     */
    public String gethouse_isRented() {
        return house_isRented;
    }

    /**
     * 设置是否已租.
     * @param house_isRented 是否已租.
     */
    public void sethouse_isRented(String house_isRented) {
        this.house_isRented = house_isRented;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.house_id = 0;
        this.user_id = 0;
        this.admin_id = 0;
        this.house_title = null;
        this.house_rent = 0;
        this.house_pledge = 0;
        this.house_months = 0;
        this.house_address = null;
        this.house_shape = null;
        this.house_direction = null;
        this.house_area = null;
        this.house_floor = null;
        this.house_detail = null;
        this.house_jwd = null;
        this.house_isRented = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        House s = (sou instanceof House) ? (House)sou : null;
        if (s != null){
            this.house_id = s.house_id;
            this.user_id = s.user_id;
            this.admin_id = s.admin_id;
            this.house_title = s.house_title;
            this.house_rent = s.house_rent;
            this.house_pledge = s.house_pledge;
            this.house_months = s.house_months;
            this.house_address = s.house_address;
            this.house_shape = s.house_shape;
            this.house_direction = s.house_direction;
            this.house_area = s.house_area;
            this.house_floor = s.house_floor;
            this.house_detail = s.house_detail;
            this.house_jwd = s.house_jwd;
            this.house_isRented = s.house_isRented;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

