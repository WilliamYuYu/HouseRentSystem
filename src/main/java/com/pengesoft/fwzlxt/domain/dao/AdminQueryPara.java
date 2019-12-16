package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.Admin;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

/**
 * 员工信息 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:10:41.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class AdminQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(员工Id).
     */
    public static final String QueryAttr_admin_id = "admin_id";
    /**
     * 常数 查询属性名(登录名).
     */
    public static final String QueryAttr_admin_name = "admin_name";
    /**
     * 常数 查询属性名(密码).
     */
    public static final String QueryAttr_admin_pwd = "admin_pwd";
    /**
     * 常数 查询属性名(真实姓名).
     */
    public static final String QueryAttr_admin_realName = "admin_realName";
    /**
     * 常数 查询属性名(手机号).
     */
    public static final String QueryAttr_admin_tel = "admin_tel";

    /**
     * 常数 排序属性名(员工Id).
     */
    public static final String OrderAttr_admin_id = "admin_id";
    /**
     * 常数 排序属性名(登录名).
     */
    public static final String OrderAttr_admin_name = "admin_name";
    /**
     * 常数 排序属性名(密码).
     */
    public static final String OrderAttr_admin_pwd = "admin_pwd";
    /**
     * 常数 排序属性名(真实姓名).
     */
    public static final String OrderAttr_admin_realName = "admin_realName";
    /**
     * 常数 排序属性名(手机号).
     */
    public static final String OrderAttr_admin_tel = "admin_tel";

    /**
     * 默认构造方法
     */
    public AdminQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public AdminQueryPara(Admin data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public AdminQueryPara(Admin data) {
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
    public void SetQueryPara(Admin data, String order, boolean isAse) {
        if (data != null) {
            setParamByadmin_id(data.getadmin_id());
            setParamByadmin_name(data.getadmin_name());
            setParamByadmin_pwd(data.getadmin_pwd());
            setParamByadmin_realName(data.getadmin_realName());
            setParamByadmin_tel(data.getadmin_tel());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
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
     * 增加用登录名匹配条件(target like admin_name)，key:admin_name.
     * @param admin_name 登录名匹配条件参数
     */
    public void setParamByadmin_name(String admin_name){
        addParameter(QueryAttr_admin_name, admin_name);
    }

    /**
     * 增加用登录名匹配条件(admin_name为empty时也会加入此条件)，不空时(target like admin_name)，key:admin_name，为空时(target is null or target = '')，key:admin_name.
     * @param admin_name 登录名匹配条件参数
     */
    public void setParamByadmin_nameInEmpty(String admin_name){
        put(QueryAttr_admin_name, admin_name);
    }

    /**
     * 增加登录名枚举条件(target in (admin_names))，key:admin_name_Enum.
     * @param admin_names 登录名数组条件参数
     */
    public void setParamByadmin_name_Enum(String... admin_names){
        addParameterByEnum(QueryAttr_admin_name, admin_names);
    }

    /**
     * 增加用密码匹配条件(target like admin_pwd)，key:admin_pwd.
     * @param admin_pwd 密码匹配条件参数
     */
    public void setParamByadmin_pwd(String admin_pwd){
        addParameter(QueryAttr_admin_pwd, admin_pwd);
    }

    /**
     * 增加用密码匹配条件(admin_pwd为empty时也会加入此条件)，不空时(target like admin_pwd)，key:admin_pwd，为空时(target is null or target = '')，key:admin_pwd.
     * @param admin_pwd 密码匹配条件参数
     */
    public void setParamByadmin_pwdInEmpty(String admin_pwd){
        put(QueryAttr_admin_pwd, admin_pwd);
    }

    /**
     * 增加密码枚举条件(target in (admin_pwds))，key:admin_pwd_Enum.
     * @param admin_pwds 密码数组条件参数
     */
    public void setParamByadmin_pwd_Enum(String... admin_pwds){
        addParameterByEnum(QueryAttr_admin_pwd, admin_pwds);
    }

    /**
     * 增加用真实姓名匹配条件(target like admin_realName)，key:admin_realName.
     * @param admin_realName 真实姓名匹配条件参数
     */
    public void setParamByadmin_realName(String admin_realName){
        addParameter(QueryAttr_admin_realName, admin_realName);
    }

    /**
     * 增加用真实姓名匹配条件(admin_realName为empty时也会加入此条件)，不空时(target like admin_realName)，key:admin_realName，为空时(target is null or target = '')，key:admin_realName.
     * @param admin_realName 真实姓名匹配条件参数
     */
    public void setParamByadmin_realNameInEmpty(String admin_realName){
        put(QueryAttr_admin_realName, admin_realName);
    }

    /**
     * 增加真实姓名枚举条件(target in (admin_realNames))，key:admin_realName_Enum.
     * @param admin_realNames 真实姓名数组条件参数
     */
    public void setParamByadmin_realName_Enum(String... admin_realNames){
        addParameterByEnum(QueryAttr_admin_realName, admin_realNames);
    }

    /**
     * 增加用手机号匹配条件(target like admin_tel)，key:admin_tel.
     * @param admin_tel 手机号匹配条件参数
     */
    public void setParamByadmin_tel(String admin_tel){
        addParameter(QueryAttr_admin_tel, admin_tel);
    }

    /**
     * 增加用手机号匹配条件(admin_tel为empty时也会加入此条件)，不空时(target like admin_tel)，key:admin_tel，为空时(target is null or target = '')，key:admin_tel.
     * @param admin_tel 手机号匹配条件参数
     */
    public void setParamByadmin_telInEmpty(String admin_tel){
        put(QueryAttr_admin_tel, admin_tel);
    }

    /**
     * 增加手机号枚举条件(target in (admin_tels))，key:admin_tel_Enum.
     * @param admin_tels 手机号数组条件参数
     */
    public void setParamByadmin_tel_Enum(String... admin_tels){
        addParameterByEnum(QueryAttr_admin_tel, admin_tels);
    }

}