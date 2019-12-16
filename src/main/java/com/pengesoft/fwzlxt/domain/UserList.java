package com.pengesoft.fwzlxt.domain;
import pengesoft.db.*;
import java.util.Collection;

/**
 * 用户列表 的摘要说明。
 *
 * @auther: 李晓东.
 * @date: 2019/12/16 10:54:27.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaListAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class UserList extends QueryDataList<User> {

    /**
     * 默认构造方法
     */
    public UserList() {
        super();
    }

    /**
     * 通过已存在集合构造列表
     *
     * @param c 已存在的集合
     */
    public UserList(Collection<User> c) {
        super(c);
    }

}

