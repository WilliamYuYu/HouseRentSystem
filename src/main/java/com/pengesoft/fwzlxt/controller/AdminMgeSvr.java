package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.*;
import com.pengesoft.fwzlxt.domain.OrderTradeInfoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengesoft.service.ApplicationBase;

/**
 * IAdminMgeSvr 接口实现。管理员服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:53:12.
 *
 * Copyright (C) 2008 - 鹏业软件公司
 */
@Service
@Transactional
public class AdminMgeSvr extends ApplicationBase implements IAdminMgeSvr {

    /**
     * 构造方法
     */
    @Autowired
    public AdminMgeSvr() {
        //TODO: 通过构造方法参数设置依赖注入.
    }

    /**
     * 查询负责的预约消息  .
     *
     * @param admin_id 员工Id.
     * @param bs_isDeal 预约状态.
     * @param bs_type 预约类型.
     */
    @Override
    public BespeakList queryOwnBespeak(int admin_id, String bs_isDeal, String bs_type) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 修改负责的预约消息状态(未处理改为已处理)  .
     *
     * @param bs_id 预约Id.
     */
    @Override
    public String updateBespeakIsDeal(int bs_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 未注册用户线下签约后添加合同(状态为已完成,优先添加用户手机号)  .
     *
     * @param contractInfo 合同对象.
     */
    @Override
    public String addContractInfoByUnregisted(ContractInfo contractInfo) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 注册用户添加合同（状态为未完成）  .
     *
     * @param contractInfo 合同.
     */
    @Override
    public String addContractInfoByRegisted(ContractInfo contractInfo) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询负责的合同  .
     *
     * @param admin_id 员工Id.
     * @param con_idDeal 合同是否处理.
     */
    @Override
    public ContractInfoList queryOwnContractInfo(int admin_id, String con_idDeal) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 接收上传的已签订的合同图片(更新状态为已完成)  .
     *
     * @param con_id 合同Id.
     * @param con_picFile 图片路径.
     */
    @Override
    public String uploadContractInfo(int con_id, String con_picFile) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 添加房屋信息  .
     *
     * @param house 房屋对象.
     */
    @Override
    public String addHouse(House house) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 修改房屋信息  .
     *
     * @param house 房屋对象.
     */
    @Override
    public String updateHouse(House house) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 删除房屋信息  .
     *
     * @param house_id 房屋Id.
     */
    @Override
    public String deleteHouse(int house_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 房屋下架（修改房屋是否已出租状态）  .
     *
     * @param house_id 房屋Id.
     */
    @Override
    public String updateHouseIsRented(int house_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 房屋信息查询  .
     *
     * @param house_title 房屋标题.
     */
    @Override
    public HouseList queryHouse(String house_title) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询负责的订单  .
     *
     * @param admin_id 员工Id.
     */
    @Override
    public OrderInfoList queryOwnOrderInfo(int admin_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询负责的订单交易记录  .
     *
     * @param admin_id 员工Id.
     */
    @Override
    public OrderTradeInfoList queryOwnOrderTradeInfo(int admin_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 检查权限  .
     *
     * @param admin_id 工作人员Id.
     * @param role_range 权限范围.
     */
    @Override
    public String checkRole(int admin_id, String role_range) {
        //TODO: 未实现.
        return null;
    }

}

