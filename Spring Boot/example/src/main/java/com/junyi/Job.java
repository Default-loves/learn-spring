package com.junyi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @time: 2021/4/14 17:30
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Component
@Slf4j
@Order(value = 999)
public class Job implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Thread.sleep(1_000);
        log.info("mission one");
    }
}
