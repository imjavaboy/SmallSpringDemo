package com.gbq.springframework.factory.config;


/**
 * @author 郭本琪
 * @description 单例注册接口
 * @date 2022/8/10
 * @Copyright 总有一天，会见到成功
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
