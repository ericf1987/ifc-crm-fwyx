package com.foundersc.ifc.base;

import javafx.scene.Parent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author fengye
 * @Date 2020/3/23
 * @Time 15:38
 * @Desc
 */
@SpringBootApplication
@PropertySource("classpath:application-base.yml")
@Slf4j
public class FwyxImplApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(BaseImplApplication.class);
//        app.run(args);
        new SpringApplicationBuilder().sources(Parent.class)
                .child(FwyxImplApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

        showSummary();
    }

    private static void showSummary() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.foundersc.ifc");
        String[] names = context.getBeanDefinitionNames();
        log.info("==========容器加载组件清单列表一览开始==========\n");
        for (String name : names) {
            log.info("bean组件：{}", name);
        }
        log.info("==========容器加载组件清单列表一览结束==========\n");
    }

}
