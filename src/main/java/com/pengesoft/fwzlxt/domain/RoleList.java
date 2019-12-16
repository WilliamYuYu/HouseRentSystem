package com.pengesoft.fwzlxt.domain;

import pengesoft.db.QueryDataList;

import java.util.Collection;

/**
 * 权限列表 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:47:27.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaListAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class RoleList extends QueryDataList<Role> {

    /**
     * 默认构造方法
     */
    public RoleList() {
        super();
    }

    /**
     * 通过已存在集合构造列表
     *
     * @param c 已存在的集合
     */
    public RoleList(Collection<Role> c) {
        super(c);
    }

}
