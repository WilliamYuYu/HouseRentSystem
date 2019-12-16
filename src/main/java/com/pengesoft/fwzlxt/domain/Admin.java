package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

/**
 * 员工信息 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:46:37.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class Admin extends DataPacket {

    //员工Id.
    private int admin_id;
    //登录名.
    private String admin_name;
    //密码.
    private String admin_pwd;
    //真实姓名.
    private String admin_realName;
    //手机号.
    private String admin_tel;

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
     * 获取 登录名.
     * @return 登录名.
     */
    public String getadmin_name() {
        return admin_name;
    }

    /**
     * 设置登录名.
     * @param admin_name 登录名.
     */
    public void setadmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    /**
     * 获取 密码.
     * @return 密码.
     */
    public String getadmin_pwd() {
        return admin_pwd;
    }

    /**
     * 设置密码.
     * @param admin_pwd 密码.
     */
    public void setadmin_pwd(String admin_pwd) {
        this.admin_pwd = admin_pwd;
    }

    /**
     * 获取 真实姓名.
     * @return 真实姓名.
     */
    public String getadmin_realName() {
        return admin_realName;
    }

    /**
     * 设置真实姓名.
     * @param admin_realName 真实姓名.
     */
    public void setadmin_realName(String admin_realName) {
        this.admin_realName = admin_realName;
    }

    /**
     * 获取 手机号.
     * @return 手机号.
     */
    public String getadmin_tel() {
        return admin_tel;
    }

    /**
     * 设置手机号.
     * @param admin_tel 手机号.
     */
    public void setadmin_tel(String admin_tel) {
        this.admin_tel = admin_tel;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.admin_id = 0;
        this.admin_name = null;
        this.admin_pwd = null;
        this.admin_realName = null;
        this.admin_tel = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        Admin s = (sou instanceof Admin) ? (Admin)sou : null;
        if (s != null){
            this.admin_id = s.admin_id;
            this.admin_name = s.admin_name;
            this.admin_pwd = s.admin_pwd;
            this.admin_realName = s.admin_realName;
            this.admin_tel = s.admin_tel;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

