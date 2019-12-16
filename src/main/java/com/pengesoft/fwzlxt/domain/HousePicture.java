package com.pengesoft.fwzlxt.domain;

import pengesoft.data.DataPacket;

/**
 * 房屋图片 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:45:49.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class HousePicture extends DataPacket {

    //图片Id.
    private int pic_id;
    //房屋Id.
    private int house_id;
    //图片路径.
    private String pic_path;

    /**
     * 获取 图片Id.
     * @return 图片Id.
     */
    public int getpic_id() {
        return pic_id;
    }

    /**
     * 设置图片Id.
     * @param pic_id 图片Id.
     */
    public void setpic_id(int pic_id) {
        this.pic_id = pic_id;
    }

    /**
     * 获取 房屋Id.
     * @return 房屋Id.
     */
    public int gethouse_id() {
        return house_id;
    }

    /**
     * 设置房屋Id.
     * @param house_id 房屋Id.
     */
    public void sethouse_id(int house_id) {
        this.house_id = house_id;
    }

    /**
     * 获取 图片路径.
     * @return 图片路径.
     */
    public String getpic_path() {
        return pic_path;
    }

    /**
     * 设置图片路径.
     * @param pic_path 图片路径.
     */
    public void setpic_path(String pic_path) {
        this.pic_path = pic_path;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.pic_id = 0;
        this.house_id = 0;
        this.pic_path = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        HousePicture s = (sou instanceof HousePicture) ? (HousePicture)sou : null;
        if (s != null){
            this.pic_id = s.pic_id;
            this.house_id = s.house_id;
            this.pic_path = s.pic_path;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}

