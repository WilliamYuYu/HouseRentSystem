package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.*;
import pengesoft.service.IApplication;
import pengesoft.service.PublishMethod;
import pengesoft.service.PublishName;

import java.util.Date;

/**
 * ITopAdminMgeSvr 接口定义。最高权限服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:37:59.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAppService),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
@PublishName("TopAdminMgeSvr")
public interface ITopAdminMgeSvr extends IApplication {

    /**
     * 搜索员工信息（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_realName 员工姓名.
     * @param admin_tel 手机号.
     */
    @PublishMethod
    AdminList queryAdmin(String admin_realName, String admin_tel);

    /**
     * 删除员工  .
     *
     * @param admin_id 员工Id.
     */
    @PublishMethod
    String deleteAdmin(String admin_id);

    /**
     * 添加员工  .
     *
     * @param admin 员工对象.
     */
    @PublishMethod
    String addAdmin(Admin admin);

    /**
     * 修改员工  .
     *
     * @param admin 员工对象.
     */
    @PublishMethod
    String updateAdmin(Admin admin);

    /**
     * 查询权限(传参为空查所有)  .
     *
     * @param admin_id 员工Id.
     */
    @PublishMethod
    RoleList queryAdminRole(int admin_id);

    /**
     * 添加员工权限  .
     *
     * @param admin_id 员工Id.
     * @param role_id 权限Id.
     */
    @PublishMethod
    String addAdminRole(int admin_id, int role_id);

    /**
     * 删除员工权限  .
     *
     * @param admin_id 员工Id.
     * @param role_id 权限Id.
     */
    @PublishMethod
    String deleteAdminRole(int admin_id, int role_id);

    /**
     * 移交权限（修改房屋负责人/房屋关系表）  .
     *
     * @param admin_idOld 旧员工Id.
     * @param admin_idNew 新员工Id.
     */
    @PublishMethod
    String changeAdminRole(int admin_idOld, int admin_idNew);

    /**
     * 增加用户  .
     *
     * @param user 用户对象.
     */
    @PublishMethod
    String addUser(User user);

    /**
     * 删除用户  .
     *
     * @param user_id 用户Id.
     */
    @PublishMethod
    String deleteUser(int user_id);

    /**
     * 修改用户  .
     *
     * @param user 用户对象.
     */
    @PublishMethod
    String updateUser(User user);

    /**
     * 查询用户（不传参为所有,一次只能传一个参数）  .
     *
     * @param user_name 用户名.
     * @param user_tel 手机号.
     * @param user_identity 身份证.
     */
    @PublishMethod
    UserList queryUserList(String user_name, String user_tel, String user_identity);

    /**
     * 按日期查询收入  .
     *
     * @param dayTime 日期.
     */
    @PublishMethod
    double queryDailyIncomeByDay(Date dayTime);

    /**
     * 查看总收入  .
     *
     */
    @PublishMethod
    double queryIncomeByOrderTradeInfoAmount();

    /**
     * 查看合同（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     * @param user_id 用户Id.
     */
    @PublishMethod
    ContractInfoList queryContractInfo(int admin_id, int user_id);

    /**
     * 查看订单（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     * @param user_id 用户Id.
     * @param con_id 合同Id.
     */
    @PublishMethod
    OrderInfoList queryOrderInfo(int admin_id, int user_id, int con_id);

    /**
     * 查看订单交易记录（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     * @param con_id 合同Id.
     * @param user_id 用户Id.
     */
    @PublishMethod
    OrderTradeInfoList queryOrderTradeInfo(int admin_id, int con_id, int user_id);

    /**
     * 查看日志（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     */
    @PublishMethod
    LogInfoList queryLogInfo(int admin_id);

}

