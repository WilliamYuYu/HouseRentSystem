package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.LogInfo;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

/**
 * 日志操作消息记录 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:04:36.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class LogInfoQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(日志Id).
     */
    public static final String QueryAttr_log_id = "log_id";
    /**
     * 常数 查询属性名(日志类型(增删改查)).
     */
    public static final String QueryAttr_log_type = "log_type";
    /**
     * 常数 查询属性名(员工Id).
     */
    public static final String QueryAttr_admin_id = "admin_id";
    /**
     * 常数 查询属性名(表名).
     */
    public static final String QueryAttr_tableName = "tableName";
    /**
     * 常数 查询属性名(字段名).
     */
    public static final String QueryAttr_columnName = "columnName";
    /**
     * 常数 查询属性名(数据内容).
     */
    public static final String QueryAttr_dataContent = "dataContent";

    /**
     * 常数 排序属性名(日志Id).
     */
    public static final String OrderAttr_log_id = "log_id";
    /**
     * 常数 排序属性名(日志类型(增删改查)).
     */
    public static final String OrderAttr_log_type = "log_type";
    /**
     * 常数 排序属性名(员工Id).
     */
    public static final String OrderAttr_admin_id = "admin_id";
    /**
     * 常数 排序属性名(表名).
     */
    public static final String OrderAttr_tableName = "tableName";
    /**
     * 常数 排序属性名(字段名).
     */
    public static final String OrderAttr_columnName = "columnName";
    /**
     * 常数 排序属性名(数据内容).
     */
    public static final String OrderAttr_dataContent = "dataContent";

    /**
     * 默认构造方法
     */
    public LogInfoQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public LogInfoQueryPara(LogInfo data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public LogInfoQueryPara(LogInfo data) {
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
    public void SetQueryPara(LogInfo data, String order, boolean isAse) {
        if (data != null) {
            setParamBylog_id(data.getlog_id());
            setParamBylog_type(data.getlog_type());
            setParamByadmin_id(data.getadmin_id());
            setParamBytableName(data.gettableName());
            setParamBycolumnName(data.getcolumnName());
            setParamBydataContent(data.getdataContent());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
    }

    /**
     * 增加用日志Id匹配条件(log_id非0时才会加入此条件)(target = log_id)，key:log_id.
     * @param log_id 日志Id匹配条件参数
     */
    public void setParamBylog_id(int log_id){
        addParameter(QueryAttr_log_id, log_id);
    }

    /**
     * 增加用日志Id匹配条件(log_id为0时也会加入此条件)(target = log_id)，key:log_id.
     * @param log_id 日志Id匹配条件参数
     */
    public void setParamBylog_idIncZero(int log_id){
        put(QueryAttr_log_id, log_id);
    }

    /**
     * 增加日志Id范围条件（low <= target and target >= high），key:log_id_L log_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamBylog_id_Range(int low, int high){
        addParameterByRange(QueryAttr_log_id, low, high);
    }

    /**
     * 增加日志Id枚举条件(target in (log_ids))，key:log_id_Enum.
     * @param log_ids 日志Id数组条件参数
     */
    public void setParamBylog_id_Enum(int... log_ids){
        addParameterByEnum(QueryAttr_log_id, log_ids);
    }

    /**
     * 增加用日志类型(增删改查)匹配条件(target like log_type)，key:log_type.
     * @param log_type 日志类型(增删改查)匹配条件参数
     */
    public void setParamBylog_type(String log_type){
        addParameter(QueryAttr_log_type, log_type);
    }

    /**
     * 增加用日志类型(增删改查)匹配条件(log_type为empty时也会加入此条件)，不空时(target like log_type)，key:log_type，为空时(target is null or target = '')，key:log_type.
     * @param log_type 日志类型(增删改查)匹配条件参数
     */
    public void setParamBylog_typeInEmpty(String log_type){
        put(QueryAttr_log_type, log_type);
    }

    /**
     * 增加日志类型(增删改查)枚举条件(target in (log_types))，key:log_type_Enum.
     * @param log_types 日志类型(增删改查)数组条件参数
     */
    public void setParamBylog_type_Enum(String... log_types){
        addParameterByEnum(QueryAttr_log_type, log_types);
    }

    /**
     * 增加用员工Id匹配条件(target like admin_id)，key:admin_id.
     * @param admin_id 员工Id匹配条件参数
     */
    public void setParamByadmin_id(String admin_id){
        addParameter(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加用员工Id匹配条件(admin_id为empty时也会加入此条件)，不空时(target like admin_id)，key:admin_id，为空时(target is null or target = '')，key:admin_id.
     * @param admin_id 员工Id匹配条件参数
     */
    public void setParamByadmin_idInEmpty(String admin_id){
        put(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加员工Id枚举条件(target in (admin_ids))，key:admin_id_Enum.
     * @param admin_ids 员工Id数组条件参数
     */
    public void setParamByadmin_id_Enum(String... admin_ids){
        addParameterByEnum(QueryAttr_admin_id, admin_ids);
    }

    /**
     * 增加用表名匹配条件(target like tableName)，key:tableName.
     * @param tableName 表名匹配条件参数
     */
    public void setParamBytableName(String tableName){
        addParameter(QueryAttr_tableName, tableName);
    }

    /**
     * 增加用表名匹配条件(tableName为empty时也会加入此条件)，不空时(target like tableName)，key:tableName，为空时(target is null or target = '')，key:tableName.
     * @param tableName 表名匹配条件参数
     */
    public void setParamBytableNameInEmpty(String tableName){
        put(QueryAttr_tableName, tableName);
    }

    /**
     * 增加表名枚举条件(target in (tableNames))，key:tableName_Enum.
     * @param tableNames 表名数组条件参数
     */
    public void setParamBytableName_Enum(String... tableNames){
        addParameterByEnum(QueryAttr_tableName, tableNames);
    }

    /**
     * 增加用字段名匹配条件(target like columnName)，key:columnName.
     * @param columnName 字段名匹配条件参数
     */
    public void setParamBycolumnName(String columnName){
        addParameter(QueryAttr_columnName, columnName);
    }

    /**
     * 增加用字段名匹配条件(columnName为empty时也会加入此条件)，不空时(target like columnName)，key:columnName，为空时(target is null or target = '')，key:columnName.
     * @param columnName 字段名匹配条件参数
     */
    public void setParamBycolumnNameInEmpty(String columnName){
        put(QueryAttr_columnName, columnName);
    }

    /**
     * 增加字段名枚举条件(target in (columnNames))，key:columnName_Enum.
     * @param columnNames 字段名数组条件参数
     */
    public void setParamBycolumnName_Enum(String... columnNames){
        addParameterByEnum(QueryAttr_columnName, columnNames);
    }

    /**
     * 增加用数据内容匹配条件(target like dataContent)，key:dataContent.
     * @param dataContent 数据内容匹配条件参数
     */
    public void setParamBydataContent(String dataContent){
        addParameter(QueryAttr_dataContent, dataContent);
    }

    /**
     * 增加用数据内容匹配条件(dataContent为empty时也会加入此条件)，不空时(target like dataContent)，key:dataContent，为空时(target is null or target = '')，key:dataContent.
     * @param dataContent 数据内容匹配条件参数
     */
    public void setParamBydataContentInEmpty(String dataContent){
        put(QueryAttr_dataContent, dataContent);
    }

    /**
     * 增加数据内容枚举条件(target in (dataContents))，key:dataContent_Enum.
     * @param dataContents 数据内容数组条件参数
     */
    public void setParamBydataContent_Enum(String... dataContents){
        addParameterByEnum(QueryAttr_dataContent, dataContents);
    }

}