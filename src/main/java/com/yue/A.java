package com.yue;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 岳贺伟
 * @description
 * @data
 */
@Data
@Component
public class A {

    @Autowired
    private B b;
}