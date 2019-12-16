package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.HousePicture;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

/**
 * 房屋图片 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:05:02.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class HousePictureQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(图片Id).
     */
    public static final String QueryAttr_pic_id = "pic_id";
    /**
     * 常数 查询属性名(房屋Id).
     */
    public static final String QueryAttr_house_id = "house_id";
    /**
     * 常数 查询属性名(图片路径).
     */
    public static final String QueryAttr_pic_path = "pic_path";

    /**
     * 常数 排序属性名(图片Id).
     */
    public static final String OrderAttr_pic_id = "pic_id";
    /**
     * 常数 排序属性名(房屋Id).
     */
    public static final String OrderAttr_house_id = "house_id";
    /**
     * 常数 排序属性名(图片路径).
     */
    public static final String OrderAttr_pic_path = "pic_path";

    /**
     * 默认构造方法
     */
    public HousePictureQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public HousePictureQueryPara(HousePicture data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public HousePictureQueryPara(HousePicture data) {
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
    public void SetQueryPara(HousePicture data, String order, boolean isAse) {
        if (data != null) {
            setParamBypic_id(data.getpic_id());
            setParamByhouse_id(data.gethouse_id());
            setParamBypic_path(data.getpic_path());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
    }

    /**
     * 增加用图片Id匹配条件(pic_id非0时才会加入此条件)(target = pic_id)，key:pic_id.
     * @param pic_id 图片Id匹配条件参数
     */
    public void setParamBypic_id(int pic_id){
        addParameter(QueryAttr_pic_id, pic_id);
    }

    /**
     * 增加用图片Id匹配条件(pic_id为0时也会加入此条件)(target = pic_id)，key:pic_id.
     * @param pic_id 图片Id匹配条件参数
     */
    public void setParamBypic_idIncZero(int pic_id){
        put(QueryAttr_pic_id, pic_id);
    }

    /**
     * 增加图片Id范围条件（low <= target and target >= high），key:pic_id_L pic_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamBypic_id_Range(int low, int high){
        addParameterByRange(QueryAttr_pic_id, low, high);
    }

    /**
     * 增加图片Id枚举条件(target in (pic_ids))，key:pic_id_Enum.
     * @param pic_ids 图片Id数组条件参数
     */
    public void setParamBypic_id_Enum(int... pic_ids){
        addParameterByEnum(QueryAttr_pic_id, pic_ids);
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
     * 增加用图片路径匹配条件(target like pic_path)，key:pic_path.
     * @param pic_path 图片路径匹配条件参数
     */
    public void setParamBypic_path(String pic_path){
        addParameter(QueryAttr_pic_path, pic_path);
    }

    /**
     * 增加用图片路径匹配条件(pic_path为empty时也会加入此条件)，不空时(target like pic_path)，key:pic_path，为空时(target is null or target = '')，key:pic_path.
     * @param pic_path 图片路径匹配条件参数
     */
    public void setParamBypic_pathInEmpty(String pic_path){
        put(QueryAttr_pic_path, pic_path);
    }

    /**
     * 增加图片路径枚举条件(target in (pic_paths))，key:pic_path_Enum.
     * @param pic_paths 图片路径数组条件参数
     */
    public void setParamBypic_path_Enum(String... pic_paths){
        addParameterByEnum(QueryAttr_pic_path, pic_paths);
    }

}