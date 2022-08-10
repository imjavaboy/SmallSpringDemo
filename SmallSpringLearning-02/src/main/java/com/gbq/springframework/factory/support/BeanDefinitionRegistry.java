package com.gbq.springframework.factory.support;


import com.gbq.springframework.factory.config.BeanDefinition;

/**
 * @author 郭本琪
 * @description
 * @date 2022/8/10
 * @Copyright 总有一天，会见到成功
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
