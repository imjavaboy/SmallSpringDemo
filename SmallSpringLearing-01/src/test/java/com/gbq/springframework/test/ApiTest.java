package com.gbq.springframework.test;


import com.gbq.springframework.BeanDefinition;
import com.gbq.springframework.BeanFactory;
import com.gbq.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author 郭本琪
 * @description
 * @date 2022/8/9
 * @Copyright 总有一天，会见到成功
 */

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //初始化bean
        BeanFactory beanFactory = new BeanFactory();

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
