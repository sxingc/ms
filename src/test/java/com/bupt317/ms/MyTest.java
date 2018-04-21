package com.bupt317.ms;

import com.alibaba.druid.support.json.JSONUtils;
import com.bupt317.ms.controller.TestController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chen on 2018/4/21.
 */
public class MyTest extends BaseSpringBootTest{
    @Autowired
    TestController testController;

    @Test
    public void test1(){
//      创建一个假的request请求
        MockHttpServletRequest request=new MockHttpServletRequest();
//        设置参数
        request.setParameter("name","小明");
        request.setParameter("age","21");
        request.setParameter("school","bupt");

        Map<String,Object> resultMap=new HashMap<>();
        resultMap=testController.setUser(request);
//        打印成json 看看是不是前端要求的
        System.out.println(JSONUtils.toJSONString(resultMap));
    }
}
