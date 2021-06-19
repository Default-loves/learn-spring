package com.junyi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @time: 2021/5/14 14:07
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Order(value = 100)
@Slf4j
@Component
public class Job2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("mission two");
    }
}
