package com.bupt317.ms.controller;

import com.bupt317.ms.common.contstant.ComRetCode;
import com.bupt317.ms.common.contstant.InterfaceRetCode;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

//  注入Service

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/setUser")
    public Map<String ,Object> setUser(HttpServletRequest request){
//        ① 获取参数内容
        String name= request.getParameter("name");
        String ageStr=request.getParameter("age");
        String school=request.getParameter("school");
//        ② 创建resultMap
        Map<String ,Object> resultMap=new HashMap<>();
//        ③ 校验参数
        if (name==null||ageStr==null||school==null){
//            这些常用的返回常量在  ComRetCode 中定义
            logger.error("[TestController.setUser] parameter error. name={},ageStr={},school={}",name,ageStr,school);
        }
//        去除首尾空格
        name=name.trim();
        ageStr=ageStr.trim();
        school=school.trim();

        int age;
        if (StringUtils.isBlank(name)){
            InterfaceRetCode.setAppCodeDesc(resultMap,ComRetCode.WRONG_PARAMETER);
            logger.error("[TestController.setUser] parameter error. name is blank! ");
            return resultMap;
        }

        try{
//            ⑤ 执行service中的方法

//            ⑥ 方法执行后，设置返回标志
            InterfaceRetCode.setAppCodeDesc(resultMap,ComRetCode.SUCCESS);
        }catch (Exception e){
            logger.error("[TestController.setUser] error");
            InterfaceRetCode.setAppCodeDesc(resultMap,ComRetCode.FAIL);
        }

        return resultMap;
    }


}
