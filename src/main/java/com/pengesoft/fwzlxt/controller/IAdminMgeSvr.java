package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.*;
import com.pengesoft.fwzlxt.domain.OrderTradeInfoList;
import pengesoft.service.IApplication;
import pengesoft.service.PublishMethod;
import pengesoft.service.PublishName;

/**
 * IAdminMgeSvr 接口定义。管理员服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:39:08.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAppService),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
@PublishName("AdminMgeSvr")
public interface IAdminMgeSvr extends IApplication {

    /**
     * 查询负责的预约消息  .
     *
     * @param admin_id 员工Id.
     * @param bs_isDeal 预约状态.
     * @param bs_type 预约类型.
     */
    @PublishMethod
    BespeakList queryOwnBespeak(int admin_id, String bs_isDeal, String bs_type);

    /**
     * 修改负责的预约消息状态(未处理改为已处理)  .
     *
     * @param bs_id 预约Id.
     */
    @PublishMethod
    String updateBespeakIsDeal(int bs_id);

    /**
     * 未注册用户线下签约后添加合同(状态为已完成,优先添加用户手机号)  .
     *
     * @param contractInfo 合同对象.
     */
    @PublishMethod
    String addContractInfoByUnregisted(ContractInfo contractInfo);

    /**
     * 注册用户添加合同（状态为未完成）  .
     *
     * @param contractInfo 合同.
     */
    @PublishMethod
    String addContractInfoByRegisted(ContractInfo contractInfo);

    /**
     * 查询负责的合同  .
     *
     * @param admin_id 员工Id.
     * @param con_idDeal 合同是否处理.
     */
    @PublishMethod
    ContractInfoList queryOwnContractInfo(int admin_id, String con_idDeal);

    /**
     * 接收上传的已签订的合同图片(更新状态为已完成)  .
     *
     * @param con_id 合同Id.
     * @param con_picFile 图片路径.
     */
    @PublishMethod
    String uploadContractInfo(int con_id, String con_picFile);

    /**
     * 添加房屋信息  .
     *
     * @param house 房屋对象.
     */
    @PublishMethod
    String addHouse(House house);

    /**
     * 修改房屋信息  .
     *
     * @param house 房屋对象.
     */
    @PublishMethod
    String updateHouse(House house);

    /**
     * 删除房屋信息  .
     *
     * @param house_id 房屋Id.
     */
    @PublishMethod
    String deleteHouse(int house_id);

    /**
     * 房屋下架（修改房屋是否已出租状态）  .
     *
     * @param house_id 房屋Id.
     */
    @PublishMethod
    String updateHouseIsRented(int house_id);

    /**
     * 房屋信息查询  .
     *
     * @param house_title 房屋标题.
     */
    @PublishMethod
    HouseList queryHouse(String house_title);

    /**
     * 查询负责的订单  .
     *
     * @param admin_id 员工Id.
     */
    @PublishMethod
    OrderInfoList queryOwnOrderInfo(int admin_id);

    /**
     * 查询负责的订单交易记录  .
     *
     * @param admin_id 员工Id.
     */
    @PublishMethod
    OrderTradeInfoList queryOwnOrderTradeInfo(int admin_id);

    /**
     * 检查权限  .
     *
     * @param admin_id 工作人员Id.
     * @param role_range 权限范围.
     */
    String checkRole(int admin_id, String role_range);

}

