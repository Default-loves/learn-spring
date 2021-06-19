package com.junyi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Cookie 的使用
 * @time: 2021/6/19 10:35
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@Slf4j
public class MyController {


    @GetMapping("setCookie")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("color", "blue");
        cookie.setMaxAge(100);
        response.addCookie(cookie);
        return "OK";
    }

    @GetMapping("query")
    public String query(@CookieValue(name = "color", defaultValue = "default color") String color) {
      log.info("color: {}", color);
        return "OK";
    }

    @GetMapping("getAll")
    public String getAllCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "empty";
        }
        String s = Arrays.stream(cookies).map(t -> t.getName() + "= " + t.getValue()).collect(Collectors.joining(","));
        log.info(s);
        return "OK";
    }

}
