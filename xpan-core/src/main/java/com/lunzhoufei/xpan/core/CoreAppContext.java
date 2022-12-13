package com.lunzhoufei.xpan.core;

import com.lunzhoufei.xpan.repository.RepositoryAppContext;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@AutoConfiguration
//@EnableAutoConfiguration
@ComponentScan(value = "com.lunzhoufei.xpan.core")
@Import(value = {
        RepositoryAppContext.class
})
@EnableTransactionManagement
public class CoreAppContext {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
}