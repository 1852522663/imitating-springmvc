package com.heaboy.annotation;

import javax.xml.ws.RequestWrapper;
import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @ interface Controller {
}
