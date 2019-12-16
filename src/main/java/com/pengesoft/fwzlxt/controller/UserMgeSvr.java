package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengesoft.service.ApplicationBase;

import java.util.Date;

/**
 * IUserMgeSvr 接口实现。用户服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:58:04.
 *
 * Copyright (C) 2008 - 鹏业软件公司
 */
@Service
@Transactional
public class UserMgeSvr extends ApplicationBase implements IUserMgeSvr {

    /**
     * 构造方法
     */
    @Autowired
    public UserMgeSvr() {
        //TODO: 通过构造方法参数设置依赖注入.
    }

    /**
     * 更新个人信息  .
     *
     * @param user 用户.
     */
    @Override
    public User updateUserInfo(User user) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查看租房合同  .
     *
     * @param user_id 用户Id.
     */
    @Override
    public ContractInfoList queryOwnContract(int user_id) {

        return null;
    }

    /**
     * 查看收藏列表  .
     *
     * @param user_id 用户Id.
     */
    @Override
    public HouseList queryOwnCollect(int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 删除收藏(包括批量)  .
     *
     * @param house_id 房屋Id.
     * @param user_id 用户Id.
     */
    @Override
    public String deleteOwnCollect(int house_id, int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 批量删除收藏  .
     *
     * @param house_idStr 房屋Id字符串.
     * @param user_id 用户Id.
     */
    @Override
    public String deleteOwnCollectBatch(String house_idStr, int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 添加收藏  .
     *
     * @param house_id 房屋Id.
     * @param user_id 用户Id.
     */
    @Override
    public String addOwnCollect(int house_id, int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 按条件查询  .
     *
     * @param area_str 地区字符串.
     * @param rent_str 租金字符串.
     * @param shape_str 房型字符串.
     * @param months_str 交租周期.
     */
    @Override
    public HouseList queryHouseByColomn(String area_str, String rent_str, String shape_str, String months_str) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 模糊查询  .
     *
     * @param house_title 房屋标题.
     */
    @Override
    public HouseList queryHouseByTitle(String house_title) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询自身预约  .
     *
     * @param bs_type 预约类型.
     * @param user_id 用户Id.
     */
    @Override
    public BespeakList queryOwnBespeak(String bs_type, int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 添加预约  .
     *
     * @param bespeak 预约.
     */
    @Override
    public String addBespeak(Bespeak bespeak) {
        //TODO: 未实现.
        return "你牛逼，测试成功！";
    }

    /**
     * 修改预约时间  .
     *
     * @param bs_time 预约时间.
     */
    @Override
    public String updateBespeakTime(Date bs_time) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 删除预约  .
     *
     * @param bs_id 预约Id.
     */
    @Override
    public String deleteBespeak(int bs_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查看自己的合同  .
     *
     * @param user_id 用户Id.
     */
    @Override
    public ContractInfoList queryContractInfoOfUser(int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查看自己的订单  .
     *
     * @param user_id 用户id.
     */
    @Override
    public OrderInfoList queryOrderInfoOfUser(int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查看自己的订单交易记录  .
     *
     * @param user_id 用户id.
     */
    @Override
    public OrderTradeInfoList queryOrderTradeInfoOfUser(int user_id) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 支付订单  .
     *
     * @param order_id 订单Id.
     * @param payAmount 此次支付金额.
     */
    @Override
    public String payOrder(int order_id, double payAmount) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查单个房屋信息  .
     *
     * @param house_id 房屋Id.
     */
    @Override
    public House queryHouseById(int house_id) {
        return null;
    }

}

