package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.OrderTradeInfo;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

import java.util.Date;

/**
 * 订单交易信息 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:06:18.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class OrderTradeInfoQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(记录Id).
     */
    public static final String QueryAttr_ot_id = "ot_id";
    /**
     * 常数 查询属性名(订单Id).
     */
    public static final String QueryAttr_order_id = "order_id";
    /**
     * 常数 查询属性名(用户Id).
     */
    public static final String QueryAttr_user_id = "user_id";
    /**
     * 常数 查询属性名(员工Id).
     */
    public static final String QueryAttr_admin_id = "admin_id";
    /**
     * 常数 查询属性名(合同Id).
     */
    public static final String QueryAttr_con_id = "con_id";
    /**
     * 常数 查询属性名(此单交易金额).
     */
    public static final String QueryAttr_ot_amount = "ot_amount";
    /**
     * 常数 查询属性名(此单交易时间).
     */
    public static final String QueryAttr_ot_time = "ot_time";

    /**
     * 常数 排序属性名(记录Id).
     */
    public static final String OrderAttr_ot_id = "ot_id";
    /**
     * 常数 排序属性名(订单Id).
     */
    public static final String OrderAttr_order_id = "order_id";
    /**
     * 常数 排序属性名(用户Id).
     */
    public static final String OrderAttr_user_id = "user_id";
    /**
     * 常数 排序属性名(员工Id).
     */
    public static final String OrderAttr_admin_id = "admin_id";
    /**
     * 常数 排序属性名(合同Id).
     */
    public static final String OrderAttr_con_id = "con_id";
    /**
     * 常数 排序属性名(此单交易金额).
     */
    public static final String OrderAttr_ot_amount = "ot_amount";
    /**
     * 常数 排序属性名(此单交易时间).
     */
    public static final String OrderAttr_ot_time = "ot_time";

    /**
     * 默认构造方法
     */
    public OrderTradeInfoQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public OrderTradeInfoQueryPara(OrderTradeInfo data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public OrderTradeInfoQueryPara(OrderTradeInfo data) {
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
    public void SetQueryPara(OrderTradeInfo data, String order, boolean isAse) {
        if (data != null) {
            setParamByot_id(data.getot_id());
            setParamByorder_id(data.getorder_id());
            setParamByuser_id(data.getuser_id());
            setParamByadmin_id(data.getadmin_id());
            setParamBycon_id(data.getcon_id());
            setParamByot_amount(data.getot_amount());
            setParamByot_time(data.getot_time());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
    }

    /**
     * 增加用记录Id匹配条件(ot_id非0时才会加入此条件)(target = ot_id)，key:ot_id.
     * @param ot_id 记录Id匹配条件参数
     */
    public void setParamByot_id(int ot_id){
        addParameter(QueryAttr_ot_id, ot_id);
    }

    /**
     * 增加用记录Id匹配条件(ot_id为0时也会加入此条件)(target = ot_id)，key:ot_id.
     * @param ot_id 记录Id匹配条件参数
     */
    public void setParamByot_idIncZero(int ot_id){
        put(QueryAttr_ot_id, ot_id);
    }

    /**
     * 增加记录Id范围条件（low <= target and target >= high），key:ot_id_L ot_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByot_id_Range(int low, int high){
        addParameterByRange(QueryAttr_ot_id, low, high);
    }

    /**
     * 增加记录Id枚举条件(target in (ot_ids))，key:ot_id_Enum.
     * @param ot_ids 记录Id数组条件参数
     */
    public void setParamByot_id_Enum(int... ot_ids){
        addParameterByEnum(QueryAttr_ot_id, ot_ids);
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
     * 增加用此单交易金额匹配条件(ot_amount非0时才会加入此条件)(target = ot_amount)，key:ot_amount.
     * @param ot_amount 此单交易金额匹配条件参数
     */
    public void setParamByot_amount(double ot_amount){
        addParameter(QueryAttr_ot_amount, ot_amount);
    }

    /**
     * 增加用此单交易金额匹配条件(ot_amount为0时也会加入此条件)(target = ot_amount)，key:ot_amount.
     * @param ot_amount 此单交易金额匹配条件参数
     */
    public void setParamByot_amountIncZero(double ot_amount){
        put(QueryAttr_ot_amount, ot_amount);
    }

    /**
     * 增加此单交易金额范围条件（low <= target and target >= high），key:ot_amount_L ot_amount_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByot_amount_Range(double low, double high){
        addParameterByRange(QueryAttr_ot_amount, low, high);
    }

    /**
     * 增加此单交易金额枚举条件(target in (ot_amounts))，key:ot_amount_Enum.
     * @param ot_amounts 此单交易金额数组条件参数
     */
    public void setParamByot_amount_Enum(double... ot_amounts){
        addParameterByEnum(QueryAttr_ot_amount, ot_amounts);
    }

    /**
     * 增加用此单交易时间匹配条件(target = ot_time)，key:ot_time.
     * @param ot_time 此单交易时间匹配条件参数
     */
    public void setParamByot_time(Date ot_time){
        addParameter(QueryAttr_ot_time, ot_time);
    }

    /**
     * 增加此单交易时间范围条件（startDate < target and target > endDate），key:ot_time_S ot_time_E.
     * @param startDate 最小值参数
     * @param endDate 最大值参数
     */
    public void setParamByot_time_Range(Date startDate, Date endDate){
        addParameterByRange(QueryAttr_ot_time, startDate, endDate);
    }

}