package com.junyi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @time: 2021/4/14 17:30
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Component
@Slf4j
public class Job implements ApplicationRunner {

    @Autowired
    ThreadPoolExecutor executor;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        executor.execute(() -> {
            log.info("start");
            ArrayList<Integer> list = null;
            for (Integer integer : list) {
                log.info(integer + "");
            }
        });
    }
}
