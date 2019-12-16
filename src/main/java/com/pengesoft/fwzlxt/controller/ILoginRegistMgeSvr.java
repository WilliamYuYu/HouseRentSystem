package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.User;
import pengesoft.service.IApplication;
import pengesoft.service.PublishMethod;
import pengesoft.service.PublishName;

/**
 * ILoginRegistMgeSvr 接口定义。登录注册服务.
 *
 * @auther: 李晓东.
 * @date: 2019/12/16 10:55:14.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAppService),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
@PublishName("LoginRegistMgeSvr")
public interface ILoginRegistMgeSvr extends IApplication {

    /**
     * 管理员登录  .
     *
     * @param admin_name 管理员用户名.
     * @param admin_pwd 密码.
     */
    @PublishMethod
    String loginByAdminName(String admin_name, String admin_pwd);

    /**
     * 用户通过用户名/手机号与密码登录  .
     *
     * @param loginInfo 登录标识.
     * @param user_pwd 密码.
     */
    @PublishMethod
    String loginByUserNameOrTel(String loginInfo, String user_pwd);

    /**
     * 用户手机验证码登录(有则建,无则免)  .
     *
     * @param telephone 手机号.
     * @param code 验证码.
     */
    @PublishMethod
    String loginByCode(String telephone, String code);

    /**
     * 用户注册  .
     *
     * @param user 用户.
     */
    @PublishMethod
    String registUser(User user);

    /**
     * 查询用户名  .
     *
     * @param userName 用户名.
     */
    @PublishMethod
    String queryUserName(String userName);

    /**
     * 查询手机  .
     *
     * @param telephone 手机号.
     */
    @PublishMethod
    String queryUserTel(String telephone);

    /**
     * 发送注册验证码  .
     *
     * @param telephone 手机号.
     */
    @PublishMethod
    String sendRegistCode(String telephone);

    /**
     * 发送登录验证码  .
     *
     * @param telephone 手机号.
     */
    @PublishMethod
    String sendLoginCode(String telephone);


}

