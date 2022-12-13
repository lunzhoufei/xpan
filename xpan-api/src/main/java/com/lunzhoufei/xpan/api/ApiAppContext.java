package com.lunzhoufei.xpan.api;

import com.lunzhoufei.xpan.core.CoreAppContext;
import com.lunzhoufei.xpan.repository.RepositoryAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;


@AutoConfiguration
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import(value = {
        CoreAppContext.class,
        RepositoryAppContext.class,
})
@EnableCaching
@SpringBootApplication
public class ApiAppContext {

//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//

    private static Logger logger = LoggerFactory.getLogger(ApiAppContext.class);

    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            SpringApplication springApplication = new SpringApplication(ApiAppContext.class);
            springApplication.setRegisterShutdownHook(false);
            ConfigurableApplicationContext ctx = springApplication.run(args);
            Runtime.getRuntime().addShutdownHook(
                    new Thread(() -> {
                        try {
                            // Thread.sleep(10000L);
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            logger.error(e.getMessage(), e);
                        }
                        ctx.close();
                    })
            );
        } catch (Exception e) {
            System.exit(-1);
        }
//         SpringApplication.run(ApiApplicationContext.class, args);
    }

    // =================================================================================================================
    //                                                       tomcat
    // =================================================================================================================

//    @Bean
//    public EmbeddedServletContainerCustomizer tomcatCustomizer() {
//
//    }


}