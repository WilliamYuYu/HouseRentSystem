package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.User;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

/**
 * 用户信息 查询参数类。
 *
 * @auther: 李晓东.
 * @date: 2019/12/16 10:58:12.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class UserQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(用户Id).
     */
    public static final String QueryAttr_user_id = "user_id";
    /**
     * 常数 查询属性名(用户名).
     */
    public static final String QueryAttr_user_name = "user_name";
    /**
     * 常数 查询属性名(密码).
     */
    public static final String QueryAttr_user_pwd = "user_pwd";
    /**
     * 常数 查询属性名(真实姓名).
     */
    public static final String QueryAttr_user_realName = "user_realName";
    /**
     * 常数 查询属性名(年龄).
     */
    public static final String QueryAttr_user_age = "user_age";
    /**
     * 常数 查询属性名(电话号码).
     */
    public static final String QueryAttr_user_tel = "user_tel";
    /**
     * 常数 查询属性名(身份证).
     */
    public static final String QueryAttr_user_identity = "user_identity";
    /**
     * 常数 查询属性名(邮箱).
     */
    public static final String QueryAttr_user_email = "user_email";
    /**
     * 常数 查询属性名(是否违约).
     */
    public static final String QueryAttr_user_isBreach = "user_isBreach";

    /**
     * 常数 排序属性名(用户Id).
     */
    public static final String OrderAttr_user_id = "user_id";
    /**
     * 常数 排序属性名(用户名).
     */
    public static final String OrderAttr_user_name = "user_name";
    /**
     * 常数 排序属性名(密码).
     */
    public static final String OrderAttr_user_pwd = "user_pwd";
    /**
     * 常数 排序属性名(真实姓名).
     */
    public static final String OrderAttr_user_realName = "user_realName";
    /**
     * 常数 排序属性名(年龄).
     */
    public static final String OrderAttr_user_age = "user_age";
    /**
     * 常数 排序属性名(电话号码).
     */
    public static final String OrderAttr_user_tel = "user_tel";
    /**
     * 常数 排序属性名(身份证).
     */
    public static final String OrderAttr_user_identity = "user_identity";
    /**
     * 常数 排序属性名(邮箱).
     */
    public static final String OrderAttr_user_email = "user_email";
    /**
     * 常数 排序属性名(是否违约).
     */
    public static final String OrderAttr_user_isBreach = "user_isBreach";

    /**
     * 默认构造方法
     */
    public UserQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public UserQueryPara(User data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public UserQueryPara(User data) {
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
    public void SetQueryPara(User data, String order, boolean isAse) {
        if (data != null) {
            setParamByuser_id(data.getuser_id());
            setParamByuser_name(data.getuser_name());
            setParamByuser_pwd(data.getuser_pwd());
            setParamByuser_realName(data.getuser_realName());
            setParamByuser_age(data.getuser_age());
            setParamByuser_tel(data.getuser_tel());
            setParamByuser_identity(data.getuser_identity());
            setParamByuser_email(data.getuser_email());
            setParamByuser_isBreach(data.getuser_isBreach());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
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
     * 增加用用户名匹配条件(target like user_name)，key:user_name.
     * @param user_name 用户名匹配条件参数
     */
    public void setParamByuser_name(String user_name){
        addParameter(QueryAttr_user_name, user_name);
    }

    /**
     * 增加用用户名匹配条件(user_name为empty时也会加入此条件)，不空时(target like user_name)，key:user_name，为空时(target is null or target = '')，key:user_name.
     * @param user_name 用户名匹配条件参数
     */
    public void setParamByuser_nameInEmpty(String user_name){
        put(QueryAttr_user_name, user_name);
    }

    /**
     * 增加用户名枚举条件(target in (user_names))，key:user_name_Enum.
     * @param user_names 用户名数组条件参数
     */
    public void setParamByuser_name_Enum(String... user_names){
        addParameterByEnum(QueryAttr_user_name, user_names);
    }

    /**
     * 增加用密码匹配条件(target like user_pwd)，key:user_pwd.
     * @param user_pwd 密码匹配条件参数
     */
    public void setParamByuser_pwd(String user_pwd){
        addParameter(QueryAttr_user_pwd, user_pwd);
    }

    /**
     * 增加用密码匹配条件(user_pwd为empty时也会加入此条件)，不空时(target like user_pwd)，key:user_pwd，为空时(target is null or target = '')，key:user_pwd.
     * @param user_pwd 密码匹配条件参数
     */
    public void setParamByuser_pwdInEmpty(String user_pwd){
        put(QueryAttr_user_pwd, user_pwd);
    }

    /**
     * 增加密码枚举条件(target in (user_pwds))，key:user_pwd_Enum.
     * @param user_pwds 密码数组条件参数
     */
    public void setParamByuser_pwd_Enum(String... user_pwds){
        addParameterByEnum(QueryAttr_user_pwd, user_pwds);
    }

    /**
     * 增加用真实姓名匹配条件(target like user_realName)，key:user_realName.
     * @param user_realName 真实姓名匹配条件参数
     */
    public void setParamByuser_realName(String user_realName){
        addParameter(QueryAttr_user_realName, user_realName);
    }

    /**
     * 增加用真实姓名匹配条件(user_realName为empty时也会加入此条件)，不空时(target like user_realName)，key:user_realName，为空时(target is null or target = '')，key:user_realName.
     * @param user_realName 真实姓名匹配条件参数
     */
    public void setParamByuser_realNameInEmpty(String user_realName){
        put(QueryAttr_user_realName, user_realName);
    }

    /**
     * 增加真实姓名枚举条件(target in (user_realNames))，key:user_realName_Enum.
     * @param user_realNames 真实姓名数组条件参数
     */
    public void setParamByuser_realName_Enum(String... user_realNames){
        addParameterByEnum(QueryAttr_user_realName, user_realNames);
    }

    /**
     * 增加用年龄匹配条件(target like user_age)，key:user_age.
     * @param user_age 年龄匹配条件参数
     */
    public void setParamByuser_age(String user_age){
        addParameter(QueryAttr_user_age, user_age);
    }

    /**
     * 增加用年龄匹配条件(user_age为empty时也会加入此条件)，不空时(target like user_age)，key:user_age，为空时(target is null or target = '')，key:user_age.
     * @param user_age 年龄匹配条件参数
     */
    public void setParamByuser_ageInEmpty(String user_age){
        put(QueryAttr_user_age, user_age);
    }

    /**
     * 增加年龄枚举条件(target in (user_ages))，key:user_age_Enum.
     * @param user_ages 年龄数组条件参数
     */
    public void setParamByuser_age_Enum(String... user_ages){
        addParameterByEnum(QueryAttr_user_age, user_ages);
    }

    /**
     * 增加用电话号码匹配条件(target like user_tel)，key:user_tel.
     * @param user_tel 电话号码匹配条件参数
     */
    public void setParamByuser_tel(String user_tel){
        addParameter(QueryAttr_user_tel, user_tel);
    }

    /**
     * 增加用电话号码匹配条件(user_tel为empty时也会加入此条件)，不空时(target like user_tel)，key:user_tel，为空时(target is null or target = '')，key:user_tel.
     * @param user_tel 电话号码匹配条件参数
     */
    public void setParamByuser_telInEmpty(String user_tel){
        put(QueryAttr_user_tel, user_tel);
    }

    /**
     * 增加电话号码枚举条件(target in (user_tels))，key:user_tel_Enum.
     * @param user_tels 电话号码数组条件参数
     */
    public void setParamByuser_tel_Enum(String... user_tels){
        addParameterByEnum(QueryAttr_user_tel, user_tels);
    }

    /**
     * 增加用身份证匹配条件(target like user_identity)，key:user_identity.
     * @param user_identity 身份证匹配条件参数
     */
    public void setParamByuser_identity(String user_identity){
        addParameter(QueryAttr_user_identity, user_identity);
    }

    /**
     * 增加用身份证匹配条件(user_identity为empty时也会加入此条件)，不空时(target like user_identity)，key:user_identity，为空时(target is null or target = '')，key:user_identity.
     * @param user_identity 身份证匹配条件参数
     */
    public void setParamByuser_identityInEmpty(String user_identity){
        put(QueryAttr_user_identity, user_identity);
    }

    /**
     * 增加身份证枚举条件(target in (user_identitys))，key:user_identity_Enum.
     * @param user_identitys 身份证数组条件参数
     */
    public void setParamByuser_identity_Enum(String... user_identitys){
        addParameterByEnum(QueryAttr_user_identity, user_identitys);
    }

    /**
     * 增加用邮箱匹配条件(target like user_email)，key:user_email.
     * @param user_email 邮箱匹配条件参数
     */
    public void setParamByuser_email(String user_email){
        addParameter(QueryAttr_user_email, user_email);
    }

    /**
     * 增加用邮箱匹配条件(user_email为empty时也会加入此条件)，不空时(target like user_email)，key:user_email，为空时(target is null or target = '')，key:user_email.
     * @param user_email 邮箱匹配条件参数
     */
    public void setParamByuser_emailInEmpty(String user_email){
        put(QueryAttr_user_email, user_email);
    }

    /**
     * 增加邮箱枚举条件(target in (user_emails))，key:user_email_Enum.
     * @param user_emails 邮箱数组条件参数
     */
    public void setParamByuser_email_Enum(String... user_emails){
        addParameterByEnum(QueryAttr_user_email, user_emails);
    }

    /**
     * 增加用是否违约匹配条件(target like user_isBreach)，key:user_isBreach.
     * @param user_isBreach 是否违约匹配条件参数
     */
    public void setParamByuser_isBreach(String user_isBreach){
        addParameter(QueryAttr_user_isBreach, user_isBreach);
    }

    /**
     * 增加用是否违约匹配条件(user_isBreach为empty时也会加入此条件)，不空时(target like user_isBreach)，key:user_isBreach，为空时(target is null or target = '')，key:user_isBreach.
     * @param user_isBreach 是否违约匹配条件参数
     */
    public void setParamByuser_isBreachInEmpty(String user_isBreach){
        put(QueryAttr_user_isBreach, user_isBreach);
    }

    /**
     * 增加是否违约枚举条件(target in (user_isBreachs))，key:user_isBreach_Enum.
     * @param user_isBreachs 是否违约数组条件参数
     */
    public void setParamByuser_isBreach_Enum(String... user_isBreachs){
        addParameterByEnum(QueryAttr_user_isBreach, user_isBreachs);
    }

}