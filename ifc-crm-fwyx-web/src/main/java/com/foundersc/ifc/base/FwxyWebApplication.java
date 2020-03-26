package com.foundersc.ifc.base;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author fengye
 * @Date 2020/3/23
 * @Time 15:38
 * @Desc
 */
@SpringBootApplication
@PropertySource("classpath:application.yml")
public class FwxyWebApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(BaseWebApplication.class);
//        app.run(args);
        new SpringApplicationBuilder().sources(Parent.class)
                .child(FwxyWebApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }

}
