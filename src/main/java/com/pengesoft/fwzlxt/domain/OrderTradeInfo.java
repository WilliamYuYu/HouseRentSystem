package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

import java.util.Date;

/**
 * 订单交易信息 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:09:25.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class OrderTradeInfo extends DataPacket {

    //记录Id.
    private int ot_id;
    //订单Id.
    private int order_id;
    //用户Id.
    private int user_id;
    //员工Id.
    private int admin_id;
    //合同Id.
    private int con_id;
    //此单交易金额.
    private double ot_amount;
    //此单交易时间.
    private Date ot_time;

    /**
     * 获取 记录Id.
     * @return 记录Id.
     */
    public int getot_id() {
        return ot_id;
    }

    /**
     * 设置记录Id.
     * @param ot_id 记录Id.
     */
    public void setot_id(int ot_id) {
        this.ot_id = ot_id;
    }

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
     * 获取 此单交易金额.
     * @return 此单交易金额.
     */
    public double getot_amount() {
        return ot_amount;
    }

    /**
     * 设置此单交易金额.
     * @param ot_amount 此单交易金额.
     */
    public void setot_amount(double ot_amount) {
        this.ot_amount = ot_amount;
    }

    /**
     * 获取 此单交易时间.
     * @return 此单交易时间.
     */
    public Date getot_time() {
        return ot_time;
    }

    /**
     * 设置此单交易时间.
     * @param ot_time 此单交易时间.
     */
    public void setot_time(Date ot_time) {
        this.ot_time = ot_time;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.ot_id = 0;
        this.order_id = 0;
        this.user_id = 0;
        this.admin_id = 0;
        this.con_id = 0;
        this.ot_amount = 0;
        this.ot_time = new Date(0);
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        OrderTradeInfo s = (sou instanceof OrderTradeInfo) ? (OrderTradeInfo)sou : null;
        if (s != null){
            this.ot_id = s.ot_id;
            this.order_id = s.order_id;
            this.user_id = s.user_id;
            this.admin_id = s.admin_id;
            this.con_id = s.con_id;
            this.ot_amount = s.ot_amount;
            if (s.ot_time != null)
                this.ot_time = new Date(s.ot_time.getTime());
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

