package com.pengesoft.fwzlxt.domain.dao;

import com.pengesoft.fwzlxt.domain.House;
import pengesoft.db.QueryParameter;
import pengesoft.utils.StringHelper;

/**
 * 房屋信息 查询参数类。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 17:10:16.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaQueryPara),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class HouseQueryPara extends QueryParameter {

    /**
     * 缺省序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常数 查询属性名(房屋Id).
     */
    public static final String QueryAttr_house_id = "house_id";
    /**
     * 常数 查询属性名(用户Id).
     */
    public static final String QueryAttr_user_id = "user_id";
    /**
     * 常数 查询属性名(负责人Id).
     */
    public static final String QueryAttr_admin_id = "admin_id";
    /**
     * 常数 查询属性名(房屋标题).
     */
    public static final String QueryAttr_house_title = "house_title";
    /**
     * 常数 查询属性名(每月租金).
     */
    public static final String QueryAttr_house_rent = "house_rent";
    /**
     * 常数 查询属性名(押金).
     */
    public static final String QueryAttr_house_pledge = "house_pledge";
    /**
     * 常数 查询属性名(交租周期).
     */
    public static final String QueryAttr_house_months = "house_months";
    /**
     * 常数 查询属性名(地址).
     */
    public static final String QueryAttr_house_address = "house_address";
    /**
     * 常数 查询属性名(房型).
     */
    public static final String QueryAttr_house_shape = "house_shape";
    /**
     * 常数 查询属性名(朝向).
     */
    public static final String QueryAttr_house_direction = "house_direction";
    /**
     * 常数 查询属性名(面积).
     */
    public static final String QueryAttr_house_area = "house_area";
    /**
     * 常数 查询属性名(楼层).
     */
    public static final String QueryAttr_house_floor = "house_floor";
    /**
     * 常数 查询属性名(房屋介绍).
     */
    public static final String QueryAttr_house_detail = "house_detail";
    /**
     * 常数 查询属性名(经纬度).
     */
    public static final String QueryAttr_house_jwd = "house_jwd";
    /**
     * 常数 查询属性名(是否已租).
     */
    public static final String QueryAttr_house_isRented = "house_isRented";

    /**
     * 常数 排序属性名(房屋Id).
     */
    public static final String OrderAttr_house_id = "house_id";
    /**
     * 常数 排序属性名(用户Id).
     */
    public static final String OrderAttr_user_id = "user_id";
    /**
     * 常数 排序属性名(负责人Id).
     */
    public static final String OrderAttr_admin_id = "admin_id";
    /**
     * 常数 排序属性名(房屋标题).
     */
    public static final String OrderAttr_house_title = "house_title";
    /**
     * 常数 排序属性名(每月租金).
     */
    public static final String OrderAttr_house_rent = "house_rent";
    /**
     * 常数 排序属性名(押金).
     */
    public static final String OrderAttr_house_pledge = "house_pledge";
    /**
     * 常数 排序属性名(交租周期).
     */
    public static final String OrderAttr_house_months = "house_months";
    /**
     * 常数 排序属性名(地址).
     */
    public static final String OrderAttr_house_address = "house_address";
    /**
     * 常数 排序属性名(房型).
     */
    public static final String OrderAttr_house_shape = "house_shape";
    /**
     * 常数 排序属性名(朝向).
     */
    public static final String OrderAttr_house_direction = "house_direction";
    /**
     * 常数 排序属性名(面积).
     */
    public static final String OrderAttr_house_area = "house_area";
    /**
     * 常数 排序属性名(楼层).
     */
    public static final String OrderAttr_house_floor = "house_floor";
    /**
     * 常数 排序属性名(房屋介绍).
     */
    public static final String OrderAttr_house_detail = "house_detail";
    /**
     * 常数 排序属性名(经纬度).
     */
    public static final String OrderAttr_house_jwd = "house_jwd";
    /**
     * 常数 排序属性名(是否已租).
     */
    public static final String OrderAttr_house_isRented = "house_isRented";

    /**
     * 默认构造方法
     */
    public HouseQueryPara() {
        super();
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data  查询参数对象
     * @param order 排序字段
     * @param isAse true升序，false降序
     */
    public HouseQueryPara(House data, String order, boolean isAse) {
        super();
        SetQueryPara(data, order, isAse);
    }

    /**
     * 构造函数,指定参数对象及排序字段
     *
     * @param data 查询参数对象
     */
    public HouseQueryPara(House data) {
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
    public void SetQueryPara(House data, String order, boolean isAse) {
        if (data != null) {
            setParamByhouse_id(data.gethouse_id());
            setParamByuser_id(data.getuser_id());
            setParamByadmin_id(data.getadmin_id());
            setParamByhouse_title(data.gethouse_title());
            setParamByhouse_rent(data.gethouse_rent());
            setParamByhouse_pledge(data.gethouse_pledge());
            setParamByhouse_months(data.gethouse_months());
            setParamByhouse_address(data.gethouse_address());
            setParamByhouse_shape(data.gethouse_shape());
            setParamByhouse_direction(data.gethouse_direction());
            setParamByhouse_area(data.gethouse_area());
            setParamByhouse_floor(data.gethouse_floor());
            setParamByhouse_detail(data.gethouse_detail());
            setParamByhouse_jwd(data.gethouse_jwd());
            setParamByhouse_isRented(data.gethouse_isRented());
        }
        if (!StringHelper.isNullOrEmpty(order))
            addOrderBy(order, isAse);
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
     * 增加用负责人Id匹配条件(admin_id非0时才会加入此条件)(target = admin_id)，key:admin_id.
     * @param admin_id 负责人Id匹配条件参数
     */
    public void setParamByadmin_id(int admin_id){
        addParameter(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加用负责人Id匹配条件(admin_id为0时也会加入此条件)(target = admin_id)，key:admin_id.
     * @param admin_id 负责人Id匹配条件参数
     */
    public void setParamByadmin_idIncZero(int admin_id){
        put(QueryAttr_admin_id, admin_id);
    }

    /**
     * 增加负责人Id范围条件（low <= target and target >= high），key:admin_id_L admin_id_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByadmin_id_Range(int low, int high){
        addParameterByRange(QueryAttr_admin_id, low, high);
    }

    /**
     * 增加负责人Id枚举条件(target in (admin_ids))，key:admin_id_Enum.
     * @param admin_ids 负责人Id数组条件参数
     */
    public void setParamByadmin_id_Enum(int... admin_ids){
        addParameterByEnum(QueryAttr_admin_id, admin_ids);
    }

    /**
     * 增加用房屋标题匹配条件(target like house_title)，key:house_title.
     * @param house_title 房屋标题匹配条件参数
     */
    public void setParamByhouse_title(String house_title){
        addParameter(QueryAttr_house_title, house_title);
    }

    /**
     * 增加用房屋标题匹配条件(house_title为empty时也会加入此条件)，不空时(target like house_title)，key:house_title，为空时(target is null or target = '')，key:house_title.
     * @param house_title 房屋标题匹配条件参数
     */
    public void setParamByhouse_titleInEmpty(String house_title){
        put(QueryAttr_house_title, house_title);
    }

    /**
     * 增加房屋标题枚举条件(target in (house_titles))，key:house_title_Enum.
     * @param house_titles 房屋标题数组条件参数
     */
    public void setParamByhouse_title_Enum(String... house_titles){
        addParameterByEnum(QueryAttr_house_title, house_titles);
    }

    /**
     * 增加用每月租金匹配条件(house_rent非0时才会加入此条件)(target = house_rent)，key:house_rent.
     * @param house_rent 每月租金匹配条件参数
     */
    public void setParamByhouse_rent(double house_rent){
        addParameter(QueryAttr_house_rent, house_rent);
    }

    /**
     * 增加用每月租金匹配条件(house_rent为0时也会加入此条件)(target = house_rent)，key:house_rent.
     * @param house_rent 每月租金匹配条件参数
     */
    public void setParamByhouse_rentIncZero(double house_rent){
        put(QueryAttr_house_rent, house_rent);
    }

    /**
     * 增加每月租金范围条件（low <= target and target >= high），key:house_rent_L house_rent_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_rent_Range(double low, double high){
        addParameterByRange(QueryAttr_house_rent, low, high);
    }

    /**
     * 增加每月租金枚举条件(target in (house_rents))，key:house_rent_Enum.
     * @param house_rents 每月租金数组条件参数
     */
    public void setParamByhouse_rent_Enum(double... house_rents){
        addParameterByEnum(QueryAttr_house_rent, house_rents);
    }

    /**
     * 增加用押金匹配条件(house_pledge非0时才会加入此条件)(target = house_pledge)，key:house_pledge.
     * @param house_pledge 押金匹配条件参数
     */
    public void setParamByhouse_pledge(double house_pledge){
        addParameter(QueryAttr_house_pledge, house_pledge);
    }

    /**
     * 增加用押金匹配条件(house_pledge为0时也会加入此条件)(target = house_pledge)，key:house_pledge.
     * @param house_pledge 押金匹配条件参数
     */
    public void setParamByhouse_pledgeIncZero(double house_pledge){
        put(QueryAttr_house_pledge, house_pledge);
    }

    /**
     * 增加押金范围条件（low <= target and target >= high），key:house_pledge_L house_pledge_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_pledge_Range(double low, double high){
        addParameterByRange(QueryAttr_house_pledge, low, high);
    }

    /**
     * 增加押金枚举条件(target in (house_pledges))，key:house_pledge_Enum.
     * @param house_pledges 押金数组条件参数
     */
    public void setParamByhouse_pledge_Enum(double... house_pledges){
        addParameterByEnum(QueryAttr_house_pledge, house_pledges);
    }

    /**
     * 增加用交租周期匹配条件(house_months非0时才会加入此条件)(target = house_months)，key:house_months.
     * @param house_months 交租周期匹配条件参数
     */
    public void setParamByhouse_months(int house_months){
        addParameter(QueryAttr_house_months, house_months);
    }

    /**
     * 增加用交租周期匹配条件(house_months为0时也会加入此条件)(target = house_months)，key:house_months.
     * @param house_months 交租周期匹配条件参数
     */
    public void setParamByhouse_monthsIncZero(int house_months){
        put(QueryAttr_house_months, house_months);
    }

    /**
     * 增加交租周期范围条件（low <= target and target >= high），key:house_months_L house_months_H.
     * @param low 最小值参数
     * @param high 最大值参数
     */
    public void setParamByhouse_months_Range(int low, int high){
        addParameterByRange(QueryAttr_house_months, low, high);
    }

    /**
     * 增加交租周期枚举条件(target in (house_monthss))，key:house_months_Enum.
     * @param house_monthss 交租周期数组条件参数
     */
    public void setParamByhouse_months_Enum(int... house_monthss){
        addParameterByEnum(QueryAttr_house_months, house_monthss);
    }

    /**
     * 增加用地址匹配条件(target like house_address)，key:house_address.
     * @param house_address 地址匹配条件参数
     */
    public void setParamByhouse_address(String house_address){
        addParameter(QueryAttr_house_address, house_address);
    }

    /**
     * 增加用地址匹配条件(house_address为empty时也会加入此条件)，不空时(target like house_address)，key:house_address，为空时(target is null or target = '')，key:house_address.
     * @param house_address 地址匹配条件参数
     */
    public void setParamByhouse_addressInEmpty(String house_address){
        put(QueryAttr_house_address, house_address);
    }

    /**
     * 增加地址枚举条件(target in (house_addresss))，key:house_address_Enum.
     * @param house_addresss 地址数组条件参数
     */
    public void setParamByhouse_address_Enum(String... house_addresss){
        addParameterByEnum(QueryAttr_house_address, house_addresss);
    }

    /**
     * 增加用房型匹配条件(target like house_shape)，key:house_shape.
     * @param house_shape 房型匹配条件参数
     */
    public void setParamByhouse_shape(String house_shape){
        addParameter(QueryAttr_house_shape, house_shape);
    }

    /**
     * 增加用房型匹配条件(house_shape为empty时也会加入此条件)，不空时(target like house_shape)，key:house_shape，为空时(target is null or target = '')，key:house_shape.
     * @param house_shape 房型匹配条件参数
     */
    public void setParamByhouse_shapeInEmpty(String house_shape){
        put(QueryAttr_house_shape, house_shape);
    }

    /**
     * 增加房型枚举条件(target in (house_shapes))，key:house_shape_Enum.
     * @param house_shapes 房型数组条件参数
     */
    public void setParamByhouse_shape_Enum(String... house_shapes){
        addParameterByEnum(QueryAttr_house_shape, house_shapes);
    }

    /**
     * 增加用朝向匹配条件(target like house_direction)，key:house_direction.
     * @param house_direction 朝向匹配条件参数
     */
    public void setParamByhouse_direction(String house_direction){
        addParameter(QueryAttr_house_direction, house_direction);
    }

    /**
     * 增加用朝向匹配条件(house_direction为empty时也会加入此条件)，不空时(target like house_direction)，key:house_direction，为空时(target is null or target = '')，key:house_direction.
     * @param house_direction 朝向匹配条件参数
     */
    public void setParamByhouse_directionInEmpty(String house_direction){
        put(QueryAttr_house_direction, house_direction);
    }

    /**
     * 增加朝向枚举条件(target in (house_directions))，key:house_direction_Enum.
     * @param house_directions 朝向数组条件参数
     */
    public void setParamByhouse_direction_Enum(String... house_directions){
        addParameterByEnum(QueryAttr_house_direction, house_directions);
    }

    /**
     * 增加用面积匹配条件(target like house_area)，key:house_area.
     * @param house_area 面积匹配条件参数
     */
    public void setParamByhouse_area(String house_area){
        addParameter(QueryAttr_house_area, house_area);
    }

    /**
     * 增加用面积匹配条件(house_area为empty时也会加入此条件)，不空时(target like house_area)，key:house_area，为空时(target is null or target = '')，key:house_area.
     * @param house_area 面积匹配条件参数
     */
    public void setParamByhouse_areaInEmpty(String house_area){
        put(QueryAttr_house_area, house_area);
    }

    /**
     * 增加面积枚举条件(target in (house_areas))，key:house_area_Enum.
     * @param house_areas 面积数组条件参数
     */
    public void setParamByhouse_area_Enum(String... house_areas){
        addParameterByEnum(QueryAttr_house_area, house_areas);
    }

    /**
     * 增加用楼层匹配条件(target like house_floor)，key:house_floor.
     * @param house_floor 楼层匹配条件参数
     */
    public void setParamByhouse_floor(String house_floor){
        addParameter(QueryAttr_house_floor, house_floor);
    }

    /**
     * 增加用楼层匹配条件(house_floor为empty时也会加入此条件)，不空时(target like house_floor)，key:house_floor，为空时(target is null or target = '')，key:house_floor.
     * @param house_floor 楼层匹配条件参数
     */
    public void setParamByhouse_floorInEmpty(String house_floor){
        put(QueryAttr_house_floor, house_floor);
    }

    /**
     * 增加楼层枚举条件(target in (house_floors))，key:house_floor_Enum.
     * @param house_floors 楼层数组条件参数
     */
    public void setParamByhouse_floor_Enum(String... house_floors){
        addParameterByEnum(QueryAttr_house_floor, house_floors);
    }

    /**
     * 增加用房屋介绍匹配条件(target like house_detail)，key:house_detail.
     * @param house_detail 房屋介绍匹配条件参数
     */
    public void setParamByhouse_detail(String house_detail){
        addParameter(QueryAttr_house_detail, house_detail);
    }

    /**
     * 增加用房屋介绍匹配条件(house_detail为empty时也会加入此条件)，不空时(target like house_detail)，key:house_detail，为空时(target is null or target = '')，key:house_detail.
     * @param house_detail 房屋介绍匹配条件参数
     */
    public void setParamByhouse_detailInEmpty(String house_detail){
        put(QueryAttr_house_detail, house_detail);
    }

    /**
     * 增加房屋介绍枚举条件(target in (house_details))，key:house_detail_Enum.
     * @param house_details 房屋介绍数组条件参数
     */
    public void setParamByhouse_detail_Enum(String... house_details){
        addParameterByEnum(QueryAttr_house_detail, house_details);
    }

    /**
     * 增加用经纬度匹配条件(target like house_jwd)，key:house_jwd.
     * @param house_jwd 经纬度匹配条件参数
     */
    public void setParamByhouse_jwd(String house_jwd){
        addParameter(QueryAttr_house_jwd, house_jwd);
    }

    /**
     * 增加用经纬度匹配条件(house_jwd为empty时也会加入此条件)，不空时(target like house_jwd)，key:house_jwd，为空时(target is null or target = '')，key:house_jwd.
     * @param house_jwd 经纬度匹配条件参数
     */
    public void setParamByhouse_jwdInEmpty(String house_jwd){
        put(QueryAttr_house_jwd, house_jwd);
    }

    /**
     * 增加经纬度枚举条件(target in (house_jwds))，key:house_jwd_Enum.
     * @param house_jwds 经纬度数组条件参数
     */
    public void setParamByhouse_jwd_Enum(String... house_jwds){
        addParameterByEnum(QueryAttr_house_jwd, house_jwds);
    }

    /**
     * 增加用是否已租匹配条件(target like house_isRented)，key:house_isRented.
     * @param house_isRented 是否已租匹配条件参数
     */
    public void setParamByhouse_isRented(String house_isRented){
        addParameter(QueryAttr_house_isRented, house_isRented);
    }

    /**
     * 增加用是否已租匹配条件(house_isRented为empty时也会加入此条件)，不空时(target like house_isRented)，key:house_isRented，为空时(target is null or target = '')，key:house_isRented.
     * @param house_isRented 是否已租匹配条件参数
     */
    public void setParamByhouse_isRentedInEmpty(String house_isRented){
        put(QueryAttr_house_isRented, house_isRented);
    }

    /**
     * 增加是否已租枚举条件(target in (house_isRenteds))，key:house_isRented_Enum.
     * @param house_isRenteds 是否已租数组条件参数
     */
    public void setParamByhouse_isRented_Enum(String... house_isRenteds){
        addParameterByEnum(QueryAttr_house_isRented, house_isRenteds);
    }

}