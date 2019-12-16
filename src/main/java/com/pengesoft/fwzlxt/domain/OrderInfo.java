package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

/**
 * 订单信息 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:43:11.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class OrderInfo extends DataPacket {

    //订单Id.
    private int order_id;
    //合同Id.
    private int con_id;
    //员工Id.
    private int admin_id;
    //用户Id.
    private int user_id;
    //缴租周期.
    private int house_months;
    //押金.
    private double house_pledge;
    //房租应缴.
    private double order_shouldPay;
    //实缴.
    private double order_alreadyPay;
    //订单理应缴付时间.
    private String order_time;
    //订单状态.
    private String order_isPaid;

    /**
     * 获取 订单Id.
     * @return 订单Id.
     */
    public int getorder_id() {
        return order_id;
    }

    /**
     * 设置订单Id.
     * @param order_id 订单Id.
     */
    public void setorder_id(int order_id) {
        this.order_id = order_id;
    }

    /**
     * 获取 合同Id.
     * @return 合同Id.
     */
    public int getcon_id() {
        return con_id;
    }

    /**
     * 设置合同Id.
     * @param con_id 合同Id.
     */
    public void setcon_id(int con_id) {
        this.con_id = con_id;
    }

    /**
     * 获取 员工Id.
     * @return 员工Id.
     */
    public int getadmin_id() {
        return admin_id;
    }

    /**
     * 设置员工Id.
     * @param admin_id 员工Id.
     */
    public void setadmin_id(int admin_id) {
        this.admin_id = admin_id;
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
     * 获取 缴租周期.
     * @return 缴租周期.
     */
    public int gethouse_months() {
        return house_months;
    }

    /**
     * 设置缴租周期.
     * @param house_months 缴租周期.
     */
    public void sethouse_months(int house_months) {
        this.house_months = house_months;
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
     * 获取 房租应缴.
     * @return 房租应缴.
     */
    public double getorder_shouldPay() {
        return order_shouldPay;
    }

    /**
     * 设置房租应缴.
     * @param order_shouldPay 房租应缴.
     */
    public void setorder_shouldPay(double order_shouldPay) {
        this.order_shouldPay = order_shouldPay;
    }

    /**
     * 获取 实缴.
     * @return 实缴.
     */
    public double getorder_alreadyPay() {
        return order_alreadyPay;
    }

    /**
     * 设置实缴.
     * @param order_alreadyPay 实缴.
     */
    public void setorder_alreadyPay(double order_alreadyPay) {
        this.order_alreadyPay = order_alreadyPay;
    }

    /**
     * 获取 订单理应缴付时间.
     * @return 订单理应缴付时间.
     */
    public String getorder_time() {
        return order_time;
    }

    /**
     * 设置订单理应缴付时间.
     * @param order_time 订单理应缴付时间.
     */
    public void setorder_time(String order_time) {
        this.order_time = order_time;
    }

    /**
     * 获取 订单状态.
     * @return 订单状态.
     */
    public String getorder_isPaid() {
        return order_isPaid;
    }

    /**
     * 设置订单状态.
     * @param order_isPaid 订单状态.
     */
    public void setorder_isPaid(String order_isPaid) {
        this.order_isPaid = order_isPaid;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.order_id = 0;
        this.con_id = 0;
        this.admin_id = 0;
        this.user_id = 0;
        this.house_months = 0;
        this.house_pledge = 0;
        this.order_shouldPay = 0;
        this.order_alreadyPay = 0;
        this.order_time = null;
        this.order_isPaid = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        OrderInfo s = (sou instanceof OrderInfo) ? (OrderInfo)sou : null;
        if (s != null){
            this.order_id = s.order_id;
            this.con_id = s.con_id;
            this.admin_id = s.admin_id;
            this.user_id = s.user_id;
            this.house_months = s.house_months;
            this.house_pledge = s.house_pledge;
            this.order_shouldPay = s.order_shouldPay;
            this.order_alreadyPay = s.order_alreadyPay;
            this.order_time = s.order_time;
            this.order_isPaid = s.order_isPaid;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

