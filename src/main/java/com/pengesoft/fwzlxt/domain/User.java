package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

/**
 * 用户信息 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/16 11:31:14.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class User extends DataPacket {

    //用户Id.
    private int user_id;
    //用户名.
    private String user_name;
    //密码.
    private String user_pwd;
    //真实姓名.
    private String user_realName;
    //年龄.
    private String user_age;
    //电话号码.
    private String user_tel;
    //身份证.
    private String user_identity;
    //邮箱.
    private String user_email;
    //是否违约.
    private String user_isBreach;

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
     * 获取 用户名.
     * @return 用户名.
     */
    public String getuser_name() {
        return user_name;
    }

    /**
     * 设置用户名.
     * @param user_name 用户名.
     */
    public void setuser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * 获取 密码.
     * @return 密码.
     */
    public String getuser_pwd() {
        return user_pwd;
    }

    /**
     * 设置密码.
     * @param user_pwd 密码.
     */
    public void setuser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    /**
     * 获取 真实姓名.
     * @return 真实姓名.
     */
    public String getuser_realName() {
        return user_realName;
    }

    /**
     * 设置真实姓名.
     * @param user_realName 真实姓名.
     */
    public void setuser_realName(String user_realName) {
        this.user_realName = user_realName;
    }

    /**
     * 获取 年龄.
     * @return 年龄.
     */
    public String getuser_age() {
        return user_age;
    }

    /**
     * 设置年龄.
     * @param user_age 年龄.
     */
    public void setuser_age(String user_age) {
        this.user_age = user_age;
    }

    /**
     * 获取 电话号码.
     * @return 电话号码.
     */
    public String getuser_tel() {
        return user_tel;
    }

    /**
     * 设置电话号码.
     * @param user_tel 电话号码.
     */
    public void setuser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    /**
     * 获取 身份证.
     * @return 身份证.
     */
    public String getuser_identity() {
        return user_identity;
    }

    /**
     * 设置身份证.
     * @param user_identity 身份证.
     */
    public void setuser_identity(String user_identity) {
        this.user_identity = user_identity;
    }

    /**
     * 获取 邮箱.
     * @return 邮箱.
     */
    public String getuser_email() {
        return user_email;
    }

    /**
     * 设置邮箱.
     * @param user_email 邮箱.
     */
    public void setuser_email(String user_email) {
        this.user_email = user_email;
    }

    /**
     * 获取 是否违约.
     * @return 是否违约.
     */
    public String getuser_isBreach() {
        return user_isBreach;
    }

    /**
     * 设置是否违约.
     * @param user_isBreach 是否违约.
     */
    public void setuser_isBreach(String user_isBreach) {
        this.user_isBreach = user_isBreach;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.user_id = 0;
        this.user_name = null;
        this.user_pwd = null;
        this.user_realName = null;
        this.user_age = null;
        this.user_tel = null;
        this.user_identity = null;
        this.user_email = null;
        this.user_isBreach = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        User s = (sou instanceof User) ? (User)sou : null;
        if (s != null){
            this.user_id = s.user_id;
            this.user_name = s.user_name;
            this.user_pwd = s.user_pwd;
            this.user_realName = s.user_realName;
            this.user_age = s.user_age;
            this.user_tel = s.user_tel;
            this.user_identity = s.user_identity;
            this.user_email = s.user_email;
            this.user_isBreach = s.user_isBreach;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

