package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.LogInfo;
import com.pengesoft.fwzlxt.domain.OrderTradeInfo;
import pengesoft.service.IApplication;

/**
 * ILogMgeSvr 接口定义。日志记录服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:36:05.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAppService),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public interface ILogMgeSvr extends IApplication {

    /**
     * 添加日志  .
     *
     * @param logInfo 日志对象.
     */
    String addLogInfo(LogInfo logInfo);

    /**
     * 添加订单交易记录  .
     *
     * @param orderTradeInfo 订单交易记录对象.
     */
    String addOrderTradeInfo(OrderTradeInfo orderTradeInfo);

}

