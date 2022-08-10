package com.gbq.springframework;


/**
 * @author 郭本琪
 * @description Bean定义
 * @date 2022/8/9
 * @Copyright 总有一天，会见到成功
 */

public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
