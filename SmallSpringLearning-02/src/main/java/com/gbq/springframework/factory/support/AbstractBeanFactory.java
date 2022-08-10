package com.gbq.springframework.factory.support;


import com.gbq.springframework.factory.BeanFactory;
import com.gbq.springframework.factory.BeansException;
import com.gbq.springframework.factory.config.BeanDefinition;
import com.gbq.springframework.factory.config.SingletonBeanRegistry;

/**
 * @author 郭本琪
 * @description
 * @date 2022/8/10
 * @Copyright 总有一天，会见到成功
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory  {


    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws  BeansException;

}
