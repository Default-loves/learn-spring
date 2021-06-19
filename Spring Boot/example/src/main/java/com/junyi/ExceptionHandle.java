package com.junyi;

import com.junyi.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @time: 2021/4/14 17:18
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    public static final String ERROR_MESSAGE = "不好意思报错了";

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response handler(Exception e) {
        // 输出用户端统一为失败，提示联系管理运维人员处理,不提示具体细节
        log.error( "system Exception:{}",e.getMessage(),e);
        return Response.of(404, ERROR_MESSAGE);
    }

}
