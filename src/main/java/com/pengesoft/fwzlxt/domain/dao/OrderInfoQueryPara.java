package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.OrderInfo;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

/**
 * 订单信息 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:05:56.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class OrderInfoQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(订单Id).
     */
    public static final String QueryAttr_order_id = "order_id";
    /**
     * 常数 查询属性名(合同Id).
     */
    public static final String QueryAttr_con_id = "con_id";
    /**
     * 常数 查询属性名(员工Id).
     */
    public static final String QueryAttr_admin_id = "admin_id";
    /**
     * 常数 查询属性名(用户Id).
     */
    public static final String QueryAttr_user_id = "user_id";
    /**
     * 常数 查询属性名(缴租周期).
     */
    public static final String QueryAttr_house_months = "house_months";
    /**
     * 常数 查询属性名(押金).
     */
    public static final String QueryAttr_house_pledge = "house_pledge";
    /**
     * 常数 查询属性名(房租应缴).
     */
    public static final String QueryAttr_order_shouldPay = "order_shouldPay";
    /**
     * 常数 查询属性名(实缴).
     */
    public static final String QueryAttr_order_alreadyPay = "order_alreadyPay";
    /**
     * 常数 查询属性名(订单理应缴付时间).
     */
    public static final String QueryAttr_order_time = "order_time";
    /**
     * 常数 查询属性名(订单状态).
     */
    public static final String QueryAttr_order_isPaid = "order_isPaid";

    /**
     * 常数 排序属性名(订单Id).
     */
    public static final String OrderAttr_order_id = "order_id";
    /**
     * 常数 排序属性名(合同Id).
     */
    public static final String OrderAttr_con_id = "con_id";
    /**
     * 常数 排序属性名(员工Id).
     */
    public static final String OrderAttr_admin_id = "admin_id";
    /**
     * 常数 排序属性名(用户Id).
     */
    public static final String OrderAttr_user_id = "user_id";
    /**
     * 常数 排序属性名(缴租周期).
     */
    public static final String OrderAttr_house_months = "house_months";
    /**
     * 常数 排序属性名(押金).
     */
    public static final String OrderAttr_house_pledge = "house_pledge";
    /**
     * 常数 排序属性名(房租应缴).
     */
    public static final String OrderAttr_order_shouldPay = "order_shouldPay";
    /**
     * 常数 排序属性名(实缴).
     */
    public static final String OrderAttr_order_alreadyPay = "order_alreadyPay";
    /**
     * 常数 排序属性名(订单理应缴付时间).
     */
    public static final String OrderAttr_order_time = "order_time";
    /**
     * 常数 排序属性名(订单状态).
     */
    public static final String OrderAttr_order_isPaid = "order_isPaid";

    /**
     * 默认构造方法
     */
    public OrderInfoQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public OrderInfoQueryPara(OrderInfo data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public OrderInfoQueryPara(OrderInfo data) {
        super();
        SetQueryPara(data, null, false);
    }

    /**
     * 指定查询参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public void SetQueryPara(OrderInfo data, String order, boolean isAse) {
        if (data != null) {
            setParamByorder_id(data.getorder_id());
            setParamBycon_id(data.getcon_id());
            setParamByadmin_id(data.getadmin_id());
            setParamByuser_id(data.getuser_id());
            setParamByhouse_months(data.gethouse_months());
            setParamByhouse_pledge(data.gethouse_pledge());
            setParamByorder_shouldPay(data.getorder_shouldPay());
            setParamByorder_alreadyPay(data.getorder_alreadyPay());
            setParamByorder_time(data.getorder_time());
            setParamByorder_isPaid(data.getorder_isPaid());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
    }

    /**
     * 增加用订单Id匹配条件(order_id非0时才会加入此条件)(target = order_id)，key:order_id.
     * @param order_id 订单Id匹配条件参数
     */
    public void setParamByorder_id(int order_id){
        addParameter(QueryAttr_order_id, order_id);
    }

    /**
     * 增加用订单Id匹配条件(order_id为0时也会加入此条件)(target = order_id)，key:order_id.
     * @param order_id 订单Id匹配条件参数
     */
    public void setParamByorder_idIncZero(int order_id){
        put(QueryAttr_order_id, order_id);
    }

    /**
     * 增加订单Id范围条件（low <= target and target >= high），key:order_id_L order_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByorder_id_Range(int low, int high){
        addParameterByRange(QueryAttr_order_id, low, high);
    }

    /**
     * 增加订单Id枚举条件(target in (order_ids))，key:order_id_Enum.
     * @param order_ids 订单Id数组条件参数
     */
    public void setParamByorder_id_Enum(int... order_ids){
        addParameterByEnum(QueryAttr_order_id, order_ids);
    }

    /**
     * 增加用合同Id匹配条件(con_id非0时才会加入此条件)(target = con_id)，key:con_id.
     * @param con_id 合同Id匹配条件参数
     */
    public void setParamBycon_id(int con_id){
        addParameter(QueryAttr_con_id, con_id);
    }

    /**
     * 增加用合同Id匹配条件(con_id为0时也会加入此条件)(target = con_id)，key:con_id.
     * @param con_id 合同Id匹配条件参数
     */
    public void setParamBycon_idIncZero(int con_id){
        put(QueryAttr_con_id, con_id);
    }

    /**
     * 增加合同Id范围条件（low <= target and target >= high），key:con_id_L con_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamBycon_id_Range(int low, int high){
        addParameterByRange(QueryAttr_con_id, low, high);
    }

    /**
     * 增加合同Id枚举条件(target in (con_ids))，key:con_id_Enum.
     * @param con_ids 合同Id数组条件参数
     */
    public void setParamBycon_id_Enum(int... con_ids){
        addParameterByEnum(QueryAttr_con_id, con_ids);
    }

    /**
     * 增加用员工Id匹配条件(admin_id非0时才会加入此条件)(target = admin_id)，key:admin_id.
     * @param admin_id 员工Id匹配条件参数
     */
    public void setParamByadmin_id(int admin_id){
        addParameter(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加用员工Id匹配条件(admin_id为0时也会加入此条件)(target = admin_id)，key:admin_id.
     * @param admin_id 员工Id匹配条件参数
     */
    public void setParamByadmin_idIncZero(int admin_id){
        put(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加员工Id范围条件（low <= target and target >= high），key:admin_id_L admin_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByadmin_id_Range(int low, int high){
        addParameterByRange(QueryAttr_admin_id, low, high);
    }

    /**
     * 增加员工Id枚举条件(target in (admin_ids))，key:admin_id_Enum.
     * @param admin_ids 员工Id数组条件参数
     */
    public void setParamByadmin_id_Enum(int... admin_ids){
        addParameterByEnum(QueryAttr_admin_id, admin_ids);
    }

    /**
     * 增加用用户Id匹配条件(user_id非0时才会加入此条件)(target = user_id)，key:user_id.
     * @param user_id 用户Id匹配条件参数
     */
    public void setParamByuser_id(int user_id){
        addParameter(QueryAttr_user_id, user_id);
    }

    /**
     * 增加用用户Id匹配条件(user_id为0时也会加入此条件)(target = user_id)，key:user_id.
     * @param user_id 用户Id匹配条件参数
     */
    public void setParamByuser_idIncZero(int user_id){
        put(QueryAttr_user_id, user_id);
    }

    /**
     * 增加用户Id范围条件（low <= target and target >= high），key:user_id_L user_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByuser_id_Range(int low, int high){
        addParameterByRange(QueryAttr_user_id, low, high);
    }

    /**
     * 增加用户Id枚举条件(target in (user_ids))，key:user_id_Enum.
     * @param user_ids 用户Id数组条件参数
     */
    public void setParamByuser_id_Enum(int... user_ids){
        addParameterByEnum(QueryAttr_user_id, user_ids);
    }

    /**
     * 增加用缴租周期匹配条件(house_months非0时才会加入此条件)(target = house_months)，key:house_months.
     * @param house_months 缴租周期匹配条件参数
     */
    public void setParamByhouse_months(int house_months){
        addParameter(QueryAttr_house_months, house_months);
    }

    /**
     * 增加用缴租周期匹配条件(house_months为0时也会加入此条件)(target = house_months)，key:house_months.
     * @param house_months 缴租周期匹配条件参数
     */
    public void setParamByhouse_monthsIncZero(int house_months){
        put(QueryAttr_house_months, house_months);
    }

    /**
     * 增加缴租周期范围条件（low <= target and target >= high），key:house_months_L house_months_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_months_Range(int low, int high){
        addParameterByRange(QueryAttr_house_months, low, high);
    }

    /**
     * 增加缴租周期枚举条件(target in (house_monthss))，key:house_months_Enum.
     * @param house_monthss 缴租周期数组条件参数
     */
    public void setParamByhouse_months_Enum(int... house_monthss){
        addParameterByEnum(QueryAttr_house_months, house_monthss);
    }

    /**
     * 增加用押金匹配条件(house_pledge非0时才会加入此条件)(target = house_pledge)，key:house_pledge.
     * @param house_pledge 押金匹配条件参数
     */
    public void setParamByhouse_pledge(double house_pledge){
        addParameter(QueryAttr_house_pledge, house_pledge);
    }

    /**
     * 增加用押金匹配条件(house_pledge为0时也会加入此条件)(target = house_pledge)，key:house_pledge.
     * @param house_pledge 押金匹配条件参数
     */
    public void setParamByhouse_pledgeIncZero(double house_pledge){
        put(QueryAttr_house_pledge, house_pledge);
    }

    /**
     * 增加押金范围条件（low <= target and target >= high），key:house_pledge_L house_pledge_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_pledge_Range(double low, double high){
        addParameterByRange(QueryAttr_house_pledge, low, high);
    }

    /**
     * 增加押金枚举条件(target in (house_pledges))，key:house_pledge_Enum.
     * @param house_pledges 押金数组条件参数
     */
    public void setParamByhouse_pledge_Enum(double... house_pledges){
        addParameterByEnum(QueryAttr_house_pledge, house_pledges);
    }

    /**
     * 增加用房租应缴匹配条件(order_shouldPay非0时才会加入此条件)(target = order_shouldPay)，key:order_shouldPay.
     * @param order_shouldPay 房租应缴匹配条件参数
     */
    public void setParamByorder_shouldPay(double order_shouldPay){
        addParameter(QueryAttr_order_shouldPay, order_shouldPay);
    }

    /**
     * 增加用房租应缴匹配条件(order_shouldPay为0时也会加入此条件)(target = order_shouldPay)，key:order_shouldPay.
     * @param order_shouldPay 房租应缴匹配条件参数
     */
    public void setParamByorder_shouldPayIncZero(double order_shouldPay){
        put(QueryAttr_order_shouldPay, order_shouldPay);
    }

    /**
     * 增加房租应缴范围条件（low <= target and target >= high），key:order_shouldPay_L order_shouldPay_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByorder_shouldPay_Range(double low, double high){
        addParameterByRange(QueryAttr_order_shouldPay, low, high);
    }

    /**
     * 增加房租应缴枚举条件(target in (order_shouldPays))，key:order_shouldPay_Enum.
     * @param order_shouldPays 房租应缴数组条件参数
     */
    public void setParamByorder_shouldPay_Enum(double... order_shouldPays){
        addParameterByEnum(QueryAttr_order_shouldPay, order_shouldPays);
    }

    /**
     * 增加用实缴匹配条件(order_alreadyPay非0时才会加入此条件)(target = order_alreadyPay)，key:order_alreadyPay.
     * @param order_alreadyPay 实缴匹配条件参数
     */
    public void setParamByorder_alreadyPay(double order_alreadyPay){
        addParameter(QueryAttr_order_alreadyPay, order_alreadyPay);
    }

    /**
     * 增加用实缴匹配条件(order_alreadyPay为0时也会加入此条件)(target = order_alreadyPay)，key:order_alreadyPay.
     * @param order_alreadyPay 实缴匹配条件参数
     */
    public void setParamByorder_alreadyPayIncZero(double order_alreadyPay){
        put(QueryAttr_order_alreadyPay, order_alreadyPay);
    }

    /**
     * 增加实缴范围条件（low <= target and target >= high），key:order_alreadyPay_L order_alreadyPay_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByorder_alreadyPay_Range(double low, double high){
        addParameterByRange(QueryAttr_order_alreadyPay, low, high);
    }

    /**
     * 增加实缴枚举条件(target in (order_alreadyPays))，key:order_alreadyPay_Enum.
     * @param order_alreadyPays 实缴数组条件参数
     */
    public void setParamByorder_alreadyPay_Enum(double... order_alreadyPays){
        addParameterByEnum(QueryAttr_order_alreadyPay, order_alreadyPays);
    }

    /**
     * 增加用订单理应缴付时间匹配条件(target like order_time)，key:order_time.
     * @param order_time 订单理应缴付时间匹配条件参数
     */
    public void setParamByorder_time(String order_time){
        addParameter(QueryAttr_order_time, order_time);
    }

    /**
     * 增加用订单理应缴付时间匹配条件(order_time为empty时也会加入此条件)，不空时(target like order_time)，key:order_time，为空时(target is null or target = '')，key:order_time.
     * @param order_time 订单理应缴付时间匹配条件参数
     */
    public void setParamByorder_timeInEmpty(String order_time){
        put(QueryAttr_order_time, order_time);
    }

    /**
     * 增加订单理应缴付时间枚举条件(target in (order_times))，key:order_time_Enum.
     * @param order_times 订单理应缴付时间数组条件参数
     */
    public void setParamByorder_time_Enum(String... order_times){
        addParameterByEnum(QueryAttr_order_time, order_times);
    }

    /**
     * 增加用订单状态匹配条件(target like order_isPaid)，key:order_isPaid.
     * @param order_isPaid 订单状态匹配条件参数
     */
    public void setParamByorder_isPaid(String order_isPaid){
        addParameter(QueryAttr_order_isPaid, order_isPaid);
    }

    /**
     * 增加用订单状态匹配条件(order_isPaid为empty时也会加入此条件)，不空时(target like order_isPaid)，key:order_isPaid，为空时(target is null or target = '')，key:order_isPaid.
     * @param order_isPaid 订单状态匹配条件参数
     */
    public void setParamByorder_isPaidInEmpty(String order_isPaid){
        put(QueryAttr_order_isPaid, order_isPaid);
    }

    /**
     * 增加订单状态枚举条件(target in (order_isPaids))，key:order_isPaid_Enum.
     * @param order_isPaids 订单状态数组条件参数
     */
    public void setParamByorder_isPaid_Enum(String... order_isPaids){
        addParameterByEnum(QueryAttr_order_isPaid, order_isPaids);
    }

}