package com.lunzhoufei.xpan.repository;

import com.lunzhoufei.xpan.common.CommonAppContext;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@AutoConfiguration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import(value = {
        CommonAppContext.class
})
@ComponentScan(value = "com.lunzhoufei.xpan.repository")
@MapperScan(basePackages = "com.lunzhoufei.xpan.repository")
public class RepositoryAppContext {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
}