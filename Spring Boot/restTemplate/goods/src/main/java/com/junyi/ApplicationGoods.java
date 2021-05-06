package com.junyi;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @time: 2021/3/11 8:53
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@SpringBootApplication
public class ApplicationGoods {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ApplicationGoods.class).web(WebApplicationType.NONE).run(args);
    }
}
