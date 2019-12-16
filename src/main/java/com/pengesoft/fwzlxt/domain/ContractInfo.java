package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

import java.util.Date;

/**
 * 合同信息 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:41:10.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class ContractInfo extends DataPacket {

    //合同Id.
    private int con_id;
    //房屋Id.
    private int house_id;
    //用户Id.
    private int user_id;
    //员工Id.
    private int admin_id;
    //合同状态.
    private String con_isSigned;
    //签订时间.
    private Date con_signTime;
    //用户真实姓名.
    private String user_realName;
    //用户身份证.
    private String user_identity;
    //房屋地址.
    private String house_address;
    //开始时间.
    private Date con_startTime;
    //终止时间.
    private Date con_endTime;
    //每月租金.
    private double house_rent;
    //缴租周期.
    private int house_months;
    //用户手机号.
    private String user_tel;
    //合同路径.
    private String con_path;

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
     * 获取 合同状态.
     * @return 合同状态.
     */
    public String getcon_isSigned() {
        return con_isSigned;
    }

    /**
     * 设置合同状态.
     * @param con_isSigned 合同状态.
     */
    public void setcon_isSigned(String con_isSigned) {
        this.con_isSigned = con_isSigned;
    }

    /**
     * 获取 签订时间.
     * @return 签订时间.
     */
    public Date getcon_signTime() {
        return con_signTime;
    }

    /**
     * 设置签订时间.
     * @param con_signTime 签订时间.
     */
    public void setcon_signTime(Date con_signTime) {
        this.con_signTime = con_signTime;
    }

    /**
     * 获取 用户真实姓名.
     * @return 用户真实姓名.
     */
    public String getuser_realName() {
        return user_realName;
    }

    /**
     * 设置用户真实姓名.
     * @param user_realName 用户真实姓名.
     */
    public void setuser_realName(String user_realName) {
        this.user_realName = user_realName;
    }

    /**
     * 获取 用户身份证.
     * @return 用户身份证.
     */
    public String getuser_identity() {
        return user_identity;
    }

    /**
     * 设置用户身份证.
     * @param user_identity 用户身份证.
     */
    public void setuser_identity(String user_identity) {
        this.user_identity = user_identity;
    }

    /**
     * 获取 房屋地址.
     * @return 房屋地址.
     */
    public String gethouse_address() {
        return house_address;
    }

    /**
     * 设置房屋地址.
     * @param house_address 房屋地址.
     */
    public void sethouse_address(String house_address) {
        this.house_address = house_address;
    }

    /**
     * 获取 开始时间.
     * @return 开始时间.
     */
    public Date getcon_startTime() {
        return con_startTime;
    }

    /**
     * 设置开始时间.
     * @param con_startTime 开始时间.
     */
    public void setcon_startTime(Date con_startTime) {
        this.con_startTime = con_startTime;
    }

    /**
     * 获取 终止时间.
     * @return 终止时间.
     */
    public Date getcon_endTime() {
        return con_endTime;
    }

    /**
     * 设置终止时间.
     * @param con_endTime 终止时间.
     */
    public void setcon_endTime(Date con_endTime) {
        this.con_endTime = con_endTime;
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
     * 获取 合同路径.
     * @return 合同路径.
     */
    public String getcon_path() {
        return con_path;
    }

    /**
     * 设置合同路径.
     * @param con_path 合同路径.
     */
    public void setcon_path(String con_path) {
        this.con_path = con_path;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.con_id = 0;
        this.house_id = 0;
        this.user_id = 0;
        this.admin_id = 0;
        this.con_isSigned = null;
        this.con_signTime = new Date(0);
        this.user_realName = null;
        this.user_identity = null;
        this.house_address = null;
        this.con_startTime = new Date(0);
        this.con_endTime = new Date(0);
        this.house_rent = 0;
        this.house_months = 0;
        this.user_tel = null;
        this.con_path = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        ContractInfo s = (sou instanceof ContractInfo) ? (ContractInfo)sou : null;
        if (s != null){
            this.con_id = s.con_id;
            this.house_id = s.house_id;
            this.user_id = s.user_id;
            this.admin_id = s.admin_id;
            this.con_isSigned = s.con_isSigned;
            if (s.con_signTime != null)
                this.con_signTime = new Date(s.con_signTime.getTime());
            this.user_realName = s.user_realName;
            this.user_identity = s.user_identity;
            this.house_address = s.house_address;
            if (s.con_startTime != null)
                this.con_startTime = new Date(s.con_startTime.getTime());
            if (s.con_endTime != null)
                this.con_endTime = new Date(s.con_endTime.getTime());
            this.house_rent = s.house_rent;
            this.house_months = s.house_months;
            this.user_tel = s.user_tel;
            this.con_path = s.con_path;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

