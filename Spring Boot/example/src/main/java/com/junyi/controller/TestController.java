package com.junyi.controller;

import com.junyi.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @time: 2021/4/6 10:28
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @GetMapping("/get")
    public Response test() {
        log.info("start");
        ArrayList<Integer> list = null;
        for (Integer integer : list) {
            log.info(integer + "");
        }
        return Response.of(0, "good");
    }


}
