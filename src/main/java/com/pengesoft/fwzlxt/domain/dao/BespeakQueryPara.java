package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.Bespeak;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

import java.util.Date;

/**
 * 预约信息 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:11:35.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class BespeakQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(预约Id).
     */
    public static final String QueryAttr_bs_id = "bs_id";
    /**
     * 常数 查询属性名(预约类型).
     */
    public static final String QueryAttr_bs_type = "bs_type";
    /**
     * 常数 查询属性名(用户Id).
     */
    public static final String QueryAttr_user_id = "user_id";
    /**
     * 常数 查询属性名(用户手机号).
     */
    public static final String QueryAttr_user_tel = "user_tel";
    /**
     * 常数 查询属性名(房子Id).
     */
    public static final String QueryAttr_house_id = "house_id";
    /**
     * 常数 查询属性名(负责人Id).
     */
    public static final String QueryAttr_admin_id = "admin_id";
    /**
     * 常数 查询属性名(预约时间).
     */
    public static final String QueryAttr_bs_time = "bs_time";
    /**
     * 常数 查询属性名(预约内容).
     */
    public static final String QueryAttr_bs_content = "bs_content";
    /**
     * 常数 查询属性名(是否处理).
     */
    public static final String QueryAttr_bs_isDeal = "bs_isDeal";

    /**
     * 常数 排序属性名(预约Id).
     */
    public static final String OrderAttr_bs_id = "bs_id";
    /**
     * 常数 排序属性名(预约类型).
     */
    public static final String OrderAttr_bs_type = "bs_type";
    /**
     * 常数 排序属性名(用户Id).
     */
    public static final String OrderAttr_user_id = "user_id";
    /**
     * 常数 排序属性名(用户手机号).
     */
    public static final String OrderAttr_user_tel = "user_tel";
    /**
     * 常数 排序属性名(房子Id).
     */
    public static final String OrderAttr_house_id = "house_id";
    /**
     * 常数 排序属性名(负责人Id).
     */
    public static final String OrderAttr_admin_id = "admin_id";
    /**
     * 常数 排序属性名(预约时间).
     */
    public static final String OrderAttr_bs_time = "bs_time";
    /**
     * 常数 排序属性名(预约内容).
     */
    public static final String OrderAttr_bs_content = "bs_content";
    /**
     * 常数 排序属性名(是否处理).
     */
    public static final String OrderAttr_bs_isDeal = "bs_isDeal";

    /**
     * 默认构造方法
     */
    public BespeakQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public BespeakQueryPara(Bespeak data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public BespeakQueryPara(Bespeak data) {
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
    public void SetQueryPara(Bespeak data, String order, boolean isAse) {
        if (data != null) {
            setParamBybs_id(data.getbs_id());
            setParamBybs_type(data.getbs_type());
            setParamByuser_id(data.getuser_id());
            setParamByuser_tel(data.getuser_tel());
            setParamByhouse_id(data.gethouse_id());
            setParamByadmin_id(data.getadmin_id());
            setParamBybs_time(data.getbs_time());
            setParamBybs_content(data.getbs_content());
            setParamBybs_isDeal(data.getbs_isDeal());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
    }

    /**
     * 增加用预约Id匹配条件(bs_id非0时才会加入此条件)(target = bs_id)，key:bs_id.
     * @param bs_id 预约Id匹配条件参数
     */
    public void setParamBybs_id(int bs_id){
        addParameter(QueryAttr_bs_id, bs_id);
    }

    /**
     * 增加用预约Id匹配条件(bs_id为0时也会加入此条件)(target = bs_id)，key:bs_id.
     * @param bs_id 预约Id匹配条件参数
     */
    public void setParamBybs_idIncZero(int bs_id){
        put(QueryAttr_bs_id, bs_id);
    }

    /**
     * 增加预约Id范围条件（low <= target and target >= high），key:bs_id_L bs_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamBybs_id_Range(int low, int high){
        addParameterByRange(QueryAttr_bs_id, low, high);
    }

    /**
     * 增加预约Id枚举条件(target in (bs_ids))，key:bs_id_Enum.
     * @param bs_ids 预约Id数组条件参数
     */
    public void setParamBybs_id_Enum(int... bs_ids){
        addParameterByEnum(QueryAttr_bs_id, bs_ids);
    }

    /**
     * 增加用预约类型匹配条件(target like bs_type)，key:bs_type.
     * @param bs_type 预约类型匹配条件参数
     */
    public void setParamBybs_type(String bs_type){
        addParameter(QueryAttr_bs_type, bs_type);
    }

    /**
     * 增加用预约类型匹配条件(bs_type为empty时也会加入此条件)，不空时(target like bs_type)，key:bs_type，为空时(target is null or target = '')，key:bs_type.
     * @param bs_type 预约类型匹配条件参数
     */
    public void setParamBybs_typeInEmpty(String bs_type){
        put(QueryAttr_bs_type, bs_type);
    }

    /**
     * 增加预约类型枚举条件(target in (bs_types))，key:bs_type_Enum.
     * @param bs_types 预约类型数组条件参数
     */
    public void setParamBybs_type_Enum(String... bs_types){
        addParameterByEnum(QueryAttr_bs_type, bs_types);
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
     * 增加用用户手机号匹配条件(target like user_tel)，key:user_tel.
     * @param user_tel 用户手机号匹配条件参数
     */
    public void setParamByuser_tel(String user_tel){
        addParameter(QueryAttr_user_tel, user_tel);
    }

    /**
     * 增加用用户手机号匹配条件(user_tel为empty时也会加入此条件)，不空时(target like user_tel)，key:user_tel，为空时(target is null or target = '')，key:user_tel.
     * @param user_tel 用户手机号匹配条件参数
     */
    public void setParamByuser_telInEmpty(String user_tel){
        put(QueryAttr_user_tel, user_tel);
    }

    /**
     * 增加用户手机号枚举条件(target in (user_tels))，key:user_tel_Enum.
     * @param user_tels 用户手机号数组条件参数
     */
    public void setParamByuser_tel_Enum(String... user_tels){
        addParameterByEnum(QueryAttr_user_tel, user_tels);
    }

    /**
     * 增加用房子Id匹配条件(house_id非0时才会加入此条件)(target = house_id)，key:house_id.
     * @param house_id 房子Id匹配条件参数
     */
    public void setParamByhouse_id(int house_id){
        addParameter(QueryAttr_house_id, house_id);
    }

    /**
     * 增加用房子Id匹配条件(house_id为0时也会加入此条件)(target = house_id)，key:house_id.
     * @param house_id 房子Id匹配条件参数
     */
    public void setParamByhouse_idIncZero(int house_id){
        put(QueryAttr_house_id, house_id);
    }

    /**
     * 增加房子Id范围条件（low <= target and target >= high），key:house_id_L house_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_id_Range(int low, int high){
        addParameterByRange(QueryAttr_house_id, low, high);
    }

    /**
     * 增加房子Id枚举条件(target in (house_ids))，key:house_id_Enum.
     * @param house_ids 房子Id数组条件参数
     */
    public void setParamByhouse_id_Enum(int... house_ids){
        addParameterByEnum(QueryAttr_house_id, house_ids);
    }

    /**
     * 增加用负责人Id匹配条件(admin_id非0时才会加入此条件)(target = admin_id)，key:admin_id.
     * @param admin_id 负责人Id匹配条件参数
     */
    public void setParamByadmin_id(int admin_id){
        addParameter(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加用负责人Id匹配条件(admin_id为0时也会加入此条件)(target = admin_id)，key:admin_id.
     * @param admin_id 负责人Id匹配条件参数
     */
    public void setParamByadmin_idIncZero(int admin_id){
        put(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加负责人Id范围条件（low <= target and target >= high），key:admin_id_L admin_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByadmin_id_Range(int low, int high){
        addParameterByRange(QueryAttr_admin_id, low, high);
    }

    /**
     * 增加负责人Id枚举条件(target in (admin_ids))，key:admin_id_Enum.
     * @param admin_ids 负责人Id数组条件参数
     */
    public void setParamByadmin_id_Enum(int... admin_ids){
        addParameterByEnum(QueryAttr_admin_id, admin_ids);
    }

    /**
     * 增加用预约时间匹配条件(target = bs_time)，key:bs_time.
     * @param bs_time 预约时间匹配条件参数
     */
    public void setParamBybs_time(Date bs_time){
        addParameter(QueryAttr_bs_time, bs_time);
    }

    /**
     * 增加预约时间范围条件（startDate < target and target > endDate），key:bs_time_S bs_time_E.
     * @param startDate 最小值参数
     * @param endDate 最大值参数
     */
    public void setParamBybs_time_Range(Date startDate, Date endDate){
        addParameterByRange(QueryAttr_bs_time, startDate, endDate);
    }

    /**
     * 增加用预约内容匹配条件(target like bs_content)，key:bs_content.
     * @param bs_content 预约内容匹配条件参数
     */
    public void setParamBybs_content(String bs_content){
        addParameter(QueryAttr_bs_content, bs_content);
    }

    /**
     * 增加用预约内容匹配条件(bs_content为empty时也会加入此条件)，不空时(target like bs_content)，key:bs_content，为空时(target is null or target = '')，key:bs_content.
     * @param bs_content 预约内容匹配条件参数
     */
    public void setParamBybs_contentInEmpty(String bs_content){
        put(QueryAttr_bs_content, bs_content);
    }

    /**
     * 增加预约内容枚举条件(target in (bs_contents))，key:bs_content_Enum.
     * @param bs_contents 预约内容数组条件参数
     */
    public void setParamBybs_content_Enum(String... bs_contents){
        addParameterByEnum(QueryAttr_bs_content, bs_contents);
    }

    /**
     * 增加用是否处理匹配条件(target like bs_isDeal)，key:bs_isDeal.
     * @param bs_isDeal 是否处理匹配条件参数
     */
    public void setParamBybs_isDeal(String bs_isDeal){
        addParameter(QueryAttr_bs_isDeal, bs_isDeal);
    }

    /**
     * 增加用是否处理匹配条件(bs_isDeal为empty时也会加入此条件)，不空时(target like bs_isDeal)，key:bs_isDeal，为空时(target is null or target = '')，key:bs_isDeal.
     * @param bs_isDeal 是否处理匹配条件参数
     */
    public void setParamBybs_isDealInEmpty(String bs_isDeal){
        put(QueryAttr_bs_isDeal, bs_isDeal);
    }

    /**
     * 增加是否处理枚举条件(target in (bs_isDeals))，key:bs_isDeal_Enum.
     * @param bs_isDeals 是否处理数组条件参数
     */
    public void setParamBybs_isDeal_Enum(String... bs_isDeals){
        addParameterByEnum(QueryAttr_bs_isDeal, bs_isDeals);
    }

}