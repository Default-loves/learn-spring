package com.junyi.entity;

import lombok.Data;

/**
 * @time: 2021/4/14 17:20
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Data
public class Response {

    private String message = "";
    private Integer code;

    public Response() {
    }

    public Response(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public static Response of(Integer code, String msg) {
        return new Response(msg, code);
    }



}
