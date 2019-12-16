package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.ContractInfo;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

import java.util.Date;

/**
 * 合同信息 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:05:36.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class ContractInfoQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(合同Id).
     */
    public static final String QueryAttr_con_id = "con_id";
    /**
     * 常数 查询属性名(房屋Id).
     */
    public static final String QueryAttr_house_id = "house_id";
    /**
     * 常数 查询属性名(用户Id).
     */
    public static final String QueryAttr_user_id = "user_id";
    /**
     * 常数 查询属性名(员工Id).
     */
    public static final String QueryAttr_admin_id = "admin_id";
    /**
     * 常数 查询属性名(合同状态).
     */
    public static final String QueryAttr_con_isSigned = "con_isSigned";
    /**
     * 常数 查询属性名(签订时间).
     */
    public static final String QueryAttr_con_signTime = "con_signTime";
    /**
     * 常数 查询属性名(用户真实姓名).
     */
    public static final String QueryAttr_user_realName = "user_realName";
    /**
     * 常数 查询属性名(用户身份证).
     */
    public static final String QueryAttr_user_identity = "user_identity";
    /**
     * 常数 查询属性名(房屋地址).
     */
    public static final String QueryAttr_house_address = "house_address";
    /**
     * 常数 查询属性名(开始时间).
     */
    public static final String QueryAttr_con_startTime = "con_startTime";
    /**
     * 常数 查询属性名(终止时间).
     */
    public static final String QueryAttr_con_endTime = "con_endTime";
    /**
     * 常数 查询属性名(每月租金).
     */
    public static final String QueryAttr_house_rent = "house_rent";
    /**
     * 常数 查询属性名(缴租周期).
     */
    public static final String QueryAttr_house_months = "house_months";
    /**
     * 常数 查询属性名(用户手机号).
     */
    public static final String QueryAttr_user_tel = "user_tel";
    /**
     * 常数 查询属性名(合同路径).
     */
    public static final String QueryAttr_con_path = "con_path";

    /**
     * 常数 排序属性名(合同Id).
     */
    public static final String OrderAttr_con_id = "con_id";
    /**
     * 常数 排序属性名(房屋Id).
     */
    public static final String OrderAttr_house_id = "house_id";
    /**
     * 常数 排序属性名(用户Id).
     */
    public static final String OrderAttr_user_id = "user_id";
    /**
     * 常数 排序属性名(员工Id).
     */
    public static final String OrderAttr_admin_id = "admin_id";
    /**
     * 常数 排序属性名(合同状态).
     */
    public static final String OrderAttr_con_isSigned = "con_isSigned";
    /**
     * 常数 排序属性名(签订时间).
     */
    public static final String OrderAttr_con_signTime = "con_signTime";
    /**
     * 常数 排序属性名(用户真实姓名).
     */
    public static final String OrderAttr_user_realName = "user_realName";
    /**
     * 常数 排序属性名(用户身份证).
     */
    public static final String OrderAttr_user_identity = "user_identity";
    /**
     * 常数 排序属性名(房屋地址).
     */
    public static final String OrderAttr_house_address = "house_address";
    /**
     * 常数 排序属性名(开始时间).
     */
    public static final String OrderAttr_con_startTime = "con_startTime";
    /**
     * 常数 排序属性名(终止时间).
     */
    public static final String OrderAttr_con_endTime = "con_endTime";
    /**
     * 常数 排序属性名(每月租金).
     */
    public static final String OrderAttr_house_rent = "house_rent";
    /**
     * 常数 排序属性名(缴租周期).
     */
    public static final String OrderAttr_house_months = "house_months";
    /**
     * 常数 排序属性名(用户手机号).
     */
    public static final String OrderAttr_user_tel = "user_tel";
    /**
     * 常数 排序属性名(合同路径).
     */
    public static final String OrderAttr_con_path = "con_path";

    /**
     * 默认构造方法
     */
    public ContractInfoQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public ContractInfoQueryPara(ContractInfo data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public ContractInfoQueryPara(ContractInfo data) {
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
    public void SetQueryPara(ContractInfo data, String order, boolean isAse) {
        if (data != null) {
            setParamBycon_id(data.getcon_id());
            setParamByhouse_id(data.gethouse_id());
            setParamByuser_id(data.getuser_id());
            setParamByadmin_id(data.getadmin_id());
            setParamBycon_isSigned(data.getcon_isSigned());
            setParamBycon_signTime(data.getcon_signTime());
            setParamByuser_realName(data.getuser_realName());
            setParamByuser_identity(data.getuser_identity());
            setParamByhouse_address(data.gethouse_address());
            setParamBycon_startTime(data.getcon_startTime());
            setParamBycon_endTime(data.getcon_endTime());
            setParamByhouse_rent(data.gethouse_rent());
            setParamByhouse_months(data.gethouse_months());
            setParamByuser_tel(data.getuser_tel());
            setParamBycon_path(data.getcon_path());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
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
     * 增加用房屋Id匹配条件(house_id非0时才会加入此条件)(target = house_id)，key:house_id.
     * @param house_id 房屋Id匹配条件参数
     */
    public void setParamByhouse_id(int house_id){
        addParameter(QueryAttr_house_id, house_id);
    }

    /**
     * 增加用房屋Id匹配条件(house_id为0时也会加入此条件)(target = house_id)，key:house_id.
     * @param house_id 房屋Id匹配条件参数
     */
    public void setParamByhouse_idIncZero(int house_id){
        put(QueryAttr_house_id, house_id);
    }

    /**
     * 增加房屋Id范围条件（low <= target and target >= high），key:house_id_L house_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_id_Range(int low, int high){
        addParameterByRange(QueryAttr_house_id, low, high);
    }

    /**
     * 增加房屋Id枚举条件(target in (house_ids))，key:house_id_Enum.
     * @param house_ids 房屋Id数组条件参数
     */
    public void setParamByhouse_id_Enum(int... house_ids){
        addParameterByEnum(QueryAttr_house_id, house_ids);
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
     * 增加用合同状态匹配条件(target like con_isSigned)，key:con_isSigned.
     * @param con_isSigned 合同状态匹配条件参数
     */
    public void setParamBycon_isSigned(String con_isSigned){
        addParameter(QueryAttr_con_isSigned, con_isSigned);
    }

    /**
     * 增加用合同状态匹配条件(con_isSigned为empty时也会加入此条件)，不空时(target like con_isSigned)，key:con_isSigned，为空时(target is null or target = '')，key:con_isSigned.
     * @param con_isSigned 合同状态匹配条件参数
     */
    public void setParamBycon_isSignedInEmpty(String con_isSigned){
        put(QueryAttr_con_isSigned, con_isSigned);
    }

    /**
     * 增加合同状态枚举条件(target in (con_isSigneds))，key:con_isSigned_Enum.
     * @param con_isSigneds 合同状态数组条件参数
     */
    public void setParamBycon_isSigned_Enum(String... con_isSigneds){
        addParameterByEnum(QueryAttr_con_isSigned, con_isSigneds);
    }

    /**
     * 增加用签订时间匹配条件(target = con_signTime)，key:con_signTime.
     * @param con_signTime 签订时间匹配条件参数
     */
    public void setParamBycon_signTime(Date con_signTime){
        addParameter(QueryAttr_con_signTime, con_signTime);
    }

    /**
     * 增加签订时间范围条件（startDate < target and target > endDate），key:con_signTime_S con_signTime_E.
     * @param startDate 最小值参数
     * @param endDate 最大值参数
     */
    public void setParamBycon_signTime_Range(Date startDate, Date endDate){
        addParameterByRange(QueryAttr_con_signTime, startDate, endDate);
    }

    /**
     * 增加用用户真实姓名匹配条件(target like user_realName)，key:user_realName.
     * @param user_realName 用户真实姓名匹配条件参数
     */
    public void setParamByuser_realName(String user_realName){
        addParameter(QueryAttr_user_realName, user_realName);
    }

    /**
     * 增加用用户真实姓名匹配条件(user_realName为empty时也会加入此条件)，不空时(target like user_realName)，key:user_realName，为空时(target is null or target = '')，key:user_realName.
     * @param user_realName 用户真实姓名匹配条件参数
     */
    public void setParamByuser_realNameInEmpty(String user_realName){
        put(QueryAttr_user_realName, user_realName);
    }

    /**
     * 增加用户真实姓名枚举条件(target in (user_realNames))，key:user_realName_Enum.
     * @param user_realNames 用户真实姓名数组条件参数
     */
    public void setParamByuser_realName_Enum(String... user_realNames){
        addParameterByEnum(QueryAttr_user_realName, user_realNames);
    }

    /**
     * 增加用用户身份证匹配条件(target like user_identity)，key:user_identity.
     * @param user_identity 用户身份证匹配条件参数
     */
    public void setParamByuser_identity(String user_identity){
        addParameter(QueryAttr_user_identity, user_identity);
    }

    /**
     * 增加用用户身份证匹配条件(user_identity为empty时也会加入此条件)，不空时(target like user_identity)，key:user_identity，为空时(target is null or target = '')，key:user_identity.
     * @param user_identity 用户身份证匹配条件参数
     */
    public void setParamByuser_identityInEmpty(String user_identity){
        put(QueryAttr_user_identity, user_identity);
    }

    /**
     * 增加用户身份证枚举条件(target in (user_identitys))，key:user_identity_Enum.
     * @param user_identitys 用户身份证数组条件参数
     */
    public void setParamByuser_identity_Enum(String... user_identitys){
        addParameterByEnum(QueryAttr_user_identity, user_identitys);
    }

    /**
     * 增加用房屋地址匹配条件(target like house_address)，key:house_address.
     * @param house_address 房屋地址匹配条件参数
     */
    public void setParamByhouse_address(String house_address){
        addParameter(QueryAttr_house_address, house_address);
    }

    /**
     * 增加用房屋地址匹配条件(house_address为empty时也会加入此条件)，不空时(target like house_address)，key:house_address，为空时(target is null or target = '')，key:house_address.
     * @param house_address 房屋地址匹配条件参数
     */
    public void setParamByhouse_addressInEmpty(String house_address){
        put(QueryAttr_house_address, house_address);
    }

    /**
     * 增加房屋地址枚举条件(target in (house_addresss))，key:house_address_Enum.
     * @param house_addresss 房屋地址数组条件参数
     */
    public void setParamByhouse_address_Enum(String... house_addresss){
        addParameterByEnum(QueryAttr_house_address, house_addresss);
    }

    /**
     * 增加用开始时间匹配条件(target = con_startTime)，key:con_startTime.
     * @param con_startTime 开始时间匹配条件参数
     */
    public void setParamBycon_startTime(Date con_startTime){
        addParameter(QueryAttr_con_startTime, con_startTime);
    }

    /**
     * 增加开始时间范围条件（startDate < target and target > endDate），key:con_startTime_S con_startTime_E.
     * @param startDate 最小值参数
     * @param endDate 最大值参数
     */
    public void setParamBycon_startTime_Range(Date startDate, Date endDate){
        addParameterByRange(QueryAttr_con_startTime, startDate, endDate);
    }

    /**
     * 增加用终止时间匹配条件(target = con_endTime)，key:con_endTime.
     * @param con_endTime 终止时间匹配条件参数
     */
    public void setParamBycon_endTime(Date con_endTime){
        addParameter(QueryAttr_con_endTime, con_endTime);
    }

    /**
     * 增加终止时间范围条件（startDate < target and target > endDate），key:con_endTime_S con_endTime_E.
     * @param startDate 最小值参数
     * @param endDate 最大值参数
     */
    public void setParamBycon_endTime_Range(Date startDate, Date endDate){
        addParameterByRange(QueryAttr_con_endTime, startDate, endDate);
    }

    /**
     * 增加用每月租金匹配条件(house_rent非0时才会加入此条件)(target = house_rent)，key:house_rent.
     * @param house_rent 每月租金匹配条件参数
     */
    public void setParamByhouse_rent(double house_rent){
        addParameter(QueryAttr_house_rent, house_rent);
    }

    /**
     * 增加用每月租金匹配条件(house_rent为0时也会加入此条件)(target = house_rent)，key:house_rent.
     * @param house_rent 每月租金匹配条件参数
     */
    public void setParamByhouse_rentIncZero(double house_rent){
        put(QueryAttr_house_rent, house_rent);
    }

    /**
     * 增加每月租金范围条件（low <= target and target >= high），key:house_rent_L house_rent_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_rent_Range(double low, double high){
        addParameterByRange(QueryAttr_house_rent, low, high);
    }

    /**
     * 增加每月租金枚举条件(target in (house_rents))，key:house_rent_Enum.
     * @param house_rents 每月租金数组条件参数
     */
    public void setParamByhouse_rent_Enum(double... house_rents){
        addParameterByEnum(QueryAttr_house_rent, house_rents);
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
     * 增加用合同路径匹配条件(target like con_path)，key:con_path.
     * @param con_path 合同路径匹配条件参数
     */
    public void setParamBycon_path(String con_path){
        addParameter(QueryAttr_con_path, con_path);
    }

    /**
     * 增加用合同路径匹配条件(con_path为empty时也会加入此条件)，不空时(target like con_path)，key:con_path，为空时(target is null or target = '')，key:con_path.
     * @param con_path 合同路径匹配条件参数
     */
    public void setParamBycon_pathInEmpty(String con_path){
        put(QueryAttr_con_path, con_path);
    }

    /**
     * 增加合同路径枚举条件(target in (con_paths))，key:con_path_Enum.
     * @param con_paths 合同路径数组条件参数
     */
    public void setParamBycon_path_Enum(String... con_paths){
        addParameterByEnum(QueryAttr_con_path, con_paths);
    }

}