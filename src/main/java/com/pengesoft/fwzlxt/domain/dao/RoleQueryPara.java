package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.Role;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

/**
 * 管理员角色权限 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:11:01.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class RoleQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(权限Id).
     */
    public static final String QueryAttr_role_id = "role_id";
    /**
     * 常数 查询属性名(权限范围).
     */
    public static final String QueryAttr_role_range = "role_range";

    /**
     * 常数 排序属性名(权限Id).
     */
    public static final String OrderAttr_role_id = "role_id";
    /**
     * 常数 排序属性名(权限范围).
     */
    public static final String OrderAttr_role_range = "role_range";

    /**
     * 默认构造方法
     */
    public RoleQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public RoleQueryPara(Role data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public RoleQueryPara(Role data) {
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
    public void SetQueryPara(Role data, String order, boolean isAse) {
        if (data != null) {
            setParamByrole_id(data.getrole_id());
            setParamByrole_range(data.getrole_range());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
    }

    /**
     * 增加用权限Id匹配条件(role_id非0时才会加入此条件)(target = role_id)，key:role_id.
     * @param role_id 权限Id匹配条件参数
     */
    public void setParamByrole_id(int role_id){
        addParameter(QueryAttr_role_id, role_id);
    }

    /**
     * 增加用权限Id匹配条件(role_id为0时也会加入此条件)(target = role_id)，key:role_id.
     * @param role_id 权限Id匹配条件参数
     */
    public void setParamByrole_idIncZero(int role_id){
        put(QueryAttr_role_id, role_id);
    }

    /**
     * 增加权限Id范围条件（low <= target and target >= high），key:role_id_L role_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByrole_id_Range(int low, int high){
        addParameterByRange(QueryAttr_role_id, low, high);
    }

    /**
     * 增加权限Id枚举条件(target in (role_ids))，key:role_id_Enum.
     * @param role_ids 权限Id数组条件参数
     */
    public void setParamByrole_id_Enum(int... role_ids){
        addParameterByEnum(QueryAttr_role_id, role_ids);
    }

    /**
     * 增加用权限范围匹配条件(target like role_range)，key:role_range.
     * @param role_range 权限范围匹配条件参数
     */
    public void setParamByrole_range(String role_range){
        addParameter(QueryAttr_role_range, role_range);
    }

    /**
     * 增加用权限范围匹配条件(role_range为empty时也会加入此条件)，不空时(target like role_range)，key:role_range，为空时(target is null or target = '')，key:role_range.
     * @param role_range 权限范围匹配条件参数
     */
    public void setParamByrole_rangeInEmpty(String role_range){
        put(QueryAttr_role_range, role_range);
    }

    /**
     * 增加权限范围枚举条件(target in (role_ranges))，key:role_range_Enum.
     * @param role_ranges 权限范围数组条件参数
     */
    public void setParamByrole_range_Enum(String... role_ranges){
        addParameterByEnum(QueryAttr_role_range, role_ranges);
    }

}