package com.pengesoft.fwzlxt.controller;

import com.pengesoft.fwzlxt.domain.LogInfo;
import com.pengesoft.fwzlxt.domain.OrderTradeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengesoft.service.ApplicationBase;

/**
 * ILogMgeSvr 接口实现。日志记录服务.
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:36:33.
 *
 * Copyright (C) 2008 - 鹏业软件公司
 */
@Service
@Transactional
public class LogMgeSvr extends ApplicationBase implements ILogMgeSvr {

    /**
     * 构造方法
     */
    @Autowired
    public LogMgeSvr() {
        //TODO: 通过构造方法参数设置依赖注入.
    }

    /**
     * 添加日志  .
     *
     * @param logInfo 日志对象.
     */
    @Override
    public String addLogInfo(LogInfo logInfo) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 添加订单交易记录  .
     *
     * @param orderTradeInfo 订单交易记录对象.
     */
    @Override
    public String addOrderTradeInfo(OrderTradeInfo orderTradeInfo) {
        //TODO: 未实现.
        return null;
    }

}

