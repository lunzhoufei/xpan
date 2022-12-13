package com.lunzhoufei.xpan.common.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgLogProcess {

    String biz() default "";

    boolean logReq() default true;

}
