package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

/**
 * 日志操作消息记录 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:40:07.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class LogInfo extends DataPacket {

    //日志Id.
    private int log_id;
    //日志类型(增删改查).
    private String log_type;
    //员工Id.
    private String admin_id;
    //表名.
    private String tableName;
    //字段名.
    private String columnName;
    //数据内容.
    private String dataContent;

    /**
     * 获取 日志Id.
     * @return 日志Id.
     */
    public int getlog_id() {
        return log_id;
    }

    /**
     * 设置日志Id.
     * @param log_id 日志Id.
     */
    public void setlog_id(int log_id) {
        this.log_id = log_id;
    }

    /**
     * 获取 日志类型(增删改查).
     * @return 日志类型(增删改查).
     */
    public String getlog_type() {
        return log_type;
    }

    /**
     * 设置日志类型(增删改查).
     * @param log_type 日志类型(增删改查).
     */
    public void setlog_type(String log_type) {
        this.log_type = log_type;
    }

    /**
     * 获取 员工Id.
     * @return 员工Id.
     */
    public String getadmin_id() {
        return admin_id;
    }

    /**
     * 设置员工Id.
     * @param admin_id 员工Id.
     */
    public void setadmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    /**
     * 获取 表名.
     * @return 表名.
     */
    public String gettableName() {
        return tableName;
    }

    /**
     * 设置表名.
     * @param tableName 表名.
     */
    public void settableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取 字段名.
     * @return 字段名.
     */
    public String getcolumnName() {
        return columnName;
    }

    /**
     * 设置字段名.
     * @param columnName 字段名.
     */
    public void setcolumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 获取 数据内容.
     * @return 数据内容.
     */
    public String getdataContent() {
        return dataContent;
    }

    /**
     * 设置数据内容.
     * @param dataContent 数据内容.
     */
    public void setdataContent(String dataContent) {
        this.dataContent = dataContent;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.log_id = 0;
        this.log_type = null;
        this.admin_id = null;
        this.tableName = null;
        this.columnName = null;
        this.dataContent = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        LogInfo s = (sou instanceof LogInfo) ? (LogInfo)sou : null;
        if (s != null){
            this.log_id = s.log_id;
            this.log_type = s.log_type;
            this.admin_id = s.admin_id;
            this.tableName = s.tableName;
            this.columnName = s.columnName;
            this.dataContent = s.dataContent;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

