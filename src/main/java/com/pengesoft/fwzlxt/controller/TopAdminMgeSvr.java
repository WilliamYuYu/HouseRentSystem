package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengesoft.service.ApplicationBase;

import java.util.Date;

/**
 * ITopAdminMgeSvr 接口实现。最高权限服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:38:14.
 *
 * Copyright (C) 2008 - 鹏业软件公司
 */
@Service
@Transactional
public class TopAdminMgeSvr extends ApplicationBase implements ITopAdminMgeSvr {

    /**
     * 构造方法
     */
    @Autowired
    public TopAdminMgeSvr() {
        //TODO: 通过构造方法参数设置依赖注入.
    }

    /**
     * 搜索员工信息（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_realName 员工姓名.
     * @param admin_tel 手机号.
     */
    @Override
    public AdminList queryAdmin(String admin_realName, String admin_tel) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 删除员工  .
     *
     * @param admin_id 员工Id.
     */
    @Override
    public String deleteAdmin(String admin_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 添加员工  .
     *
     * @param admin 员工对象.
     */
    @Override
    public String addAdmin(Admin admin) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 修改员工  .
     *
     * @param admin 员工对象.
     */
    @Override
    public String updateAdmin(Admin admin) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询权限(传参为空查所有)  .
     *
     * @param admin_id 员工Id.
     */
    @Override
    public RoleList queryAdminRole(int admin_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 添加员工权限  .
     *
     * @param admin_id 员工Id.
     * @param role_id 权限Id.
     */
    @Override
    public String addAdminRole(int admin_id, int role_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 删除员工权限  .
     *
     * @param admin_id 员工Id.
     * @param role_id 权限Id.
     */
    @Override
    public String deleteAdminRole(int admin_id, int role_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 移交权限（修改房屋负责人/房屋关系表）  .
     *
     * @param admin_idOld 旧员工Id.
     * @param admin_idNew 新员工Id.
     */
    @Override
    public String changeAdminRole(int admin_idOld, int admin_idNew) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 增加用户  .
     *
     * @param user 用户对象.
     */
    @Override
    public String addUser(User user) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 删除用户  .
     *
     * @param user_id 用户Id.
     */
    @Override
    public String deleteUser(int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 修改用户  .
     *
     * @param user 用户对象.
     */
    @Override
    public String updateUser(User user) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询用户（不传参为所有,一次只能传一个参数）  .
     *
     * @param user_name 用户名.
     * @param user_tel 手机号.
     * @param user_identity 身份证.
     */
    @Override
    public UserList queryUserList(String user_name, String user_tel, String user_identity) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 按日期查询收入  .
     *
     * @param dayTime 日期.
     */
    @Override
    public double queryDailyIncomeByDay(Date dayTime) {
        //TODO: 未实现.
        return 0;
    }

    /**
     * 查看总收入  .
     *
     */
    @Override
    public double queryIncomeByOrderTradeInfoAmount() {
        //TODO: 未实现.
        return 0;
    }

    /**
     * 查看合同（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     * @param user_id 用户Id.
     */
    @Override
    public ContractInfoList queryContractInfo(int admin_id, int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查看订单（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     * @param user_id 用户Id.
     * @param con_id 合同Id.
     */
    @Override
    public OrderInfoList queryOrderInfo(int admin_id, int user_id, int con_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查看订单交易记录（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     * @param con_id 合同Id.
     * @param user_id 用户Id.
     */
    @Override
    public OrderTradeInfoList queryOrderTradeInfo(int admin_id, int con_id, int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查看日志（不传参为所有,一次只能传一个参数）  .
     *
     * @param admin_id 员工Id.
     */
    @Override
    public LogInfoList queryLogInfo(int admin_id) {
        //TODO: 未实现.
        return null;
    }

}

