package com.yue;

/**
 * @author 岳贺伟
 * @description
 * @data
 */
public interface ObjectFactory<T> {
    /*
     *功能描述
     不管有没有循环依赖，实例化后就直接创建好代理对象，并将代理对象放入缓存，出现循环依赖时，其他对象直接就可以取到代理对象并注入（只需要2级缓存，singletonObjects和earlySingletonObjects即可）
     不提前创建好代理对象，在出现循环依赖被其他对象注入时，才提前生成代理对象（此时只完成了实例化）。这样在没有循环依赖的情况下，Bean还是在初始化完成才生成代理对象（需要3级缓存）
     所以到现在为止你知道3级缓存的作用了把，主要是为了正常情况下，代理对象能在初始化完成后生成，而不用提前生成
     */

    T getObject();

}
