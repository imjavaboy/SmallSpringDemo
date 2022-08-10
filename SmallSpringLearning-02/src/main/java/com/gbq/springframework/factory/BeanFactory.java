package com.gbq.springframework.factory;


/**
 * @author 郭本琪
 * @description
 * @date 2022/8/10
 * @Copyright 总有一天，会见到成功
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
