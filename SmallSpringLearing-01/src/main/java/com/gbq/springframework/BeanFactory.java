package com.gbq.springframework;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 郭本琪
 * @description bean工厂
 * @date 2022/8/9
 * @Copyright 总有一天，会见到成功
 */

public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
