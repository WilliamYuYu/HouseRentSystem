package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.*;
import pengesoft.service.IApplication;
import pengesoft.service.PublishMethod;
import pengesoft.service.PublishName;

import java.util.Date;

/**
 * IUserMgeSvr 接口定义。用户服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:57:47.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAppService),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
@PublishName("UserMgeSvr")
public interface IUserMgeSvr extends IApplication {

    /**
     * 更新个人信息  .
     *
     * @param user 用户.
     */
    @PublishMethod
    User updateUserInfo(User user);

    /**
     * 查看租房合同  .
     *
     * @param user_id 用户Id.
     */
    @PublishMethod
    ContractInfoList queryOwnContract(int user_id);

    /**
     * 查看收藏列表  .
     *
     * @param user_id 用户Id.
     */
    @PublishMethod
    HouseList queryOwnCollect(int user_id);

    /**
     * 删除收藏(包括批量)  .
     *
     * @param house_id 房屋Id.
     * @param user_id 用户Id.
     */
    @PublishMethod
    String deleteOwnCollect(int house_id, int user_id);

    /**
     * 批量删除收藏  .
     *
     * @param house_idStr 房屋Id字符串.
     * @param user_id 用户Id.
     */
    @PublishMethod
    String deleteOwnCollectBatch(String house_idStr, int user_id);

    /**
     * 添加收藏  .
     *
     * @param house_id 房屋Id.
     * @param user_id 用户Id.
     */
    @PublishMethod
    String addOwnCollect(int house_id, int user_id);

    /**
     * 按条件查询  .
     *
     * @param area_str 地区字符串.
     * @param rent_str 租金字符串.
     * @param shape_str 房型字符串.
     * @param months_str 交租周期.
     */
    @PublishMethod
    HouseList queryHouseByColomn(String area_str, String rent_str, String shape_str, String months_str);

    /**
     * 模糊查询  .
     *
     * @param house_title 房屋标题.
     */
    @PublishMethod
    HouseList queryHouseByTitle(String house_title);

    /**
     * 查询自身预约  .
     *
     * @param bs_type 预约类型.
     * @param user_id 用户Id.
     */
    @PublishMethod
    BespeakList queryOwnBespeak(String bs_type, int user_id);

    /**
     * 添加预约  .
     *
     * @param bespeak 预约.
     */
    @PublishMethod
    String addBespeak(Bespeak bespeak);

    /**
     * 修改预约时间  .
     *
     * @param bs_time 预约时间.
     */
    @PublishMethod
    String updateBespeakTime(Date bs_time);

    /**
     * 删除预约  .
     *
     * @param bs_id 预约Id.
     */
    @PublishMethod
    String deleteBespeak(int bs_id);

    /**
     * 查看自己的合同  .
     *
     * @param user_id 用户Id.
     */
    @PublishMethod
    ContractInfoList queryContractInfoOfUser(int user_id);

    /**
     * 查看自己的订单  .
     *
     * @param user_id 用户id.
     */
    @PublishMethod
    OrderInfoList queryOrderInfoOfUser(int user_id);

    /**
     * 查看自己的订单交易记录  .
     *
     * @param user_id 用户id.
     */
    @PublishMethod
    OrderTradeInfoList queryOrderTradeInfoOfUser(int user_id);

    /**
     * 支付订单  .
     *
     * @param order_id 订单Id.
     * @param payAmount 此次支付金额.
     */
    @PublishMethod
    String payOrder(int order_id, double payAmount);


    /**
     * 查单个房屋信息  .
     *
     * @param house_id 房屋Id.
     */
    @PublishMethod
    House queryHouseById(int house_id);
}

