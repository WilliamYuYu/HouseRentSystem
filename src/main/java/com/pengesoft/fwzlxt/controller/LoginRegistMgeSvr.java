package com.pengesoft.fwzlxt.controller;


import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.pengesoft.fwzlxt.domain.User;
import com.pengesoft.fwzlxt.domain.dao.UserDao;
import com.pengesoft.fwzlxt.domain.dao.UserQueryPara;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengesoft.service.ApplicationBase;

import java.util.List;

/**
 * ILoginRegistMgeSvr 接口实现。登录注册服务.
 *
 * @auther: 李晓东.
 * @date: 2019/12/16 10:56:00.
 *
 * Copyright (C) 2008 - 鹏业软件公司
 */
@Service
@Transactional
public class LoginRegistMgeSvr extends ApplicationBase implements ILoginRegistMgeSvr {

    @Autowired
    private UserDao ud;
    /**
     * 构造方法
     */
    @Autowired
    public LoginRegistMgeSvr() {
        //TODO: 通过构造方法参数设置依赖注入.
    }

    /**
     * 管理员登录  .
     *
     * @param admin_name 管理员用户名.
     * @param admin_pwd 密码.
     */
    @Override
    public String loginByAdminName(String admin_name, String admin_pwd) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 用户通过用户名/手机号与密码登录  .
     *
     * @param loginInfo 登录标识.
     * @param user_pwd 密码.
     */
    @Override
    public String loginByUserNameOrTel(String loginInfo, String user_pwd) {
        loginInfo="yzp";
        user_pwd="123456";
        UserQueryPara uparam = new UserQueryPara();
        uparam.setParamByuser_name(loginInfo);
        uparam.setParamByuser_pwd(user_pwd);
        List<User> ulist = ud.queryList(uparam,0,-1);
        if(ulist.size()!=0){
            if(ulist.get(0).getuser_name().equals(loginInfo)&&ulist.get(0).getuser_pwd().equals(user_pwd)){
                return "登录成功";
            }

        }
        return "登录失败";
    }

    /**
     * 用户手机验证码登录(有则建,无则免)  .
     *
     * @param telephone 手机号.
     * @param code 验证码.
     */
    @Override
    public String loginByCode(String telephone, String code) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 用户注册  .
     *
     * @param user 用户.
     */
    @Override
    public String registUser(User user) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询用户名  .
     *
     * @param userName 用户名.
     */
    @Override
    public String queryUserName(String userName) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 查询手机  .
     *
     * @param telephone 手机号.
     */
    @Override
    public String queryUserTel(String telephone) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 发送注册验证码  .
     *
     * @param telephone 手机号.
     */
    @Override
    public String sendRegistCode(String telephone) {
        //TODO: 未实现.
        return null;
    }

    /**
     * 发送登录验证码  .
     *
     * @param telephone 手机号.
     */
    @Override
    public String sendLoginCode(String telephone) {
//        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fi3TRgNfmR1jrhPLSi2", "oO0ceoUkJq3wYEG6xRYmhSFRmvoRd9");
//        IAcsClient client = new DefaultAcsClient(profile);
//        telephone = "13547971976";
//        String logincode = Double.toString((Math.random()*9+1)*100000);
//        String s = "{\"code\":"+logincode+"}";
//        CommonRequest request = new CommonRequest();
//        request.setMethod(MethodType.POST);
//        request.setDomain("dysmsapi.aliyuncs.com");
//        request.setVersion("2017-05-25");
//        request.setAction("SendSms");
//        request.putQueryParameter("RegionId", "cn-hangzhou");
//        request.putQueryParameter("PhoneNumbers", "telephone");
//        request.putQueryParameter("SignName", "PY租赁系统");
//        request.putQueryParameter("TemplateCode", "SMS_179601977");//注册码
//        request.putQueryParameter("TemplateParam", "s");
//        try {
//            CommonResponse response = client.getCommonResponse(request);
//            System.out.println(response.getData());
//        } catch (ServerException e) {
//            e.printStackTrace();
//        } catch (ClientException e) {
//            e.printStackTrace();
//        } return null;
        return null;
    }


}

