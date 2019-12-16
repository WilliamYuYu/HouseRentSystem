package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

/**
 * 管理员角色权限 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:47:08.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class Role extends DataPacket {

    //权限Id.
    private int role_id;
    //权限范围.
    private String role_range;

    /**
     * 获取 权限Id.
     * @return 权限Id.
     */
    public int getrole_id() {
        return role_id;
    }

    /**
     * 设置权限Id.
     * @param role_id 权限Id.
     */
    public void setrole_id(int role_id) {
        this.role_id = role_id;
    }

    /**
     * 获取 权限范围.
     * @return 权限范围.
     */
    public String getrole_range() {
        return role_range;
    }

    /**
     * 设置权限范围.
     * @param role_range 权限范围.
     */
    public void setrole_range(String role_range) {
        this.role_range = role_range;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.role_id = 0;
        this.role_range = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        Role s = (sou instanceof Role) ? (Role)sou : null;
        if (s != null){
            this.role_id = s.role_id;
            this.role_range = s.role_range;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

