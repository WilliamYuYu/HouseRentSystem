package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

import java.util.Date;

/**
 * 预约信息 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:47:39.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class Bespeak extends DataPacket {

    //预约Id.
    private int bs_id;
    //预约类型.
    private String bs_type;
    //用户Id.
    private int user_id;
    //用户手机号.
    private String user_tel;
    //房子Id.
    private int house_id;
    //负责人Id.
    private int admin_id;
    //预约时间.
    private Date bs_time;
    //预约内容.
    private String bs_content;
    //是否处理.
    private String bs_isDeal;

    /**
     * 获取 预约Id.
     * @return 预约Id.
     */
    public int getbs_id() {
        return bs_id;
    }

    /**
     * 设置预约Id.
     * @param bs_id 预约Id.
     */
    public void setbs_id(int bs_id) {
        this.bs_id = bs_id;
    }

    /**
     * 获取 预约类型.
     * @return 预约类型.
     */
    public String getbs_type() {
        return bs_type;
    }

    /**
     * 设置预约类型.
     * @param bs_type 预约类型.
     */
    public void setbs_type(String bs_type) {
        this.bs_type = bs_type;
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
     * 获取 用户手机号.
     * @return 用户手机号.
     */
    public String getuser_tel() {
        return user_tel;
    }

    /**
     * 设置用户手机号.
     * @param user_tel 用户手机号.
     */
    public void setuser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    /**
     * 获取 房子Id.
     * @return 房子Id.
     */
    public int gethouse_id() {
        return house_id;
    }

    /**
     * 设置房子Id.
     * @param house_id 房子Id.
     */
    public void sethouse_id(int house_id) {
        this.house_id = house_id;
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
     * 获取 预约时间.
     * @return 预约时间.
     */
    public Date getbs_time() {
        return bs_time;
    }

    /**
     * 设置预约时间.
     * @param bs_time 预约时间.
     */
    public void setbs_time(Date bs_time) {
        this.bs_time = bs_time;
    }

    /**
     * 获取 预约内容.
     * @return 预约内容.
     */
    public String getbs_content() {
        return bs_content;
    }

    /**
     * 设置预约内容.
     * @param bs_content 预约内容.
     */
    public void setbs_content(String bs_content) {
        this.bs_content = bs_content;
    }

    /**
     * 获取 是否处理.
     * @return 是否处理.
     */
    public String getbs_isDeal() {
        return bs_isDeal;
    }

    /**
     * 设置是否处理.
     * @param bs_isDeal 是否处理.
     */
    public void setbs_isDeal(String bs_isDeal) {
        this.bs_isDeal = bs_isDeal;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.bs_id = 0;
        this.bs_type = null;
        this.user_id = 0;
        this.user_tel = null;
        this.house_id = 0;
        this.admin_id = 0;
        this.bs_time = new Date(0);
        this.bs_content = null;
        this.bs_isDeal = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        Bespeak s = (sou instanceof Bespeak) ? (Bespeak)sou : null;
        if (s != null){
            this.bs_id = s.bs_id;
            this.bs_type = s.bs_type;
            this.user_id = s.user_id;
            this.user_tel = s.user_tel;
            this.house_id = s.house_id;
            this.admin_id = s.admin_id;
            if (s.bs_time != null)
                this.bs_time = new Date(s.bs_time.getTime());
            this.bs_content = s.bs_content;
            this.bs_isDeal = s.bs_isDeal;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

