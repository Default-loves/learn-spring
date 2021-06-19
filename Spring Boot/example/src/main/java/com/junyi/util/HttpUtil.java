package com.junyi.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @time: 2021/5/27 15:38
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Slf4j
public class HttpUtil {

    public static void process() {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            String requestUrl = "http:www.baidu.com";
            HttpGet httpGet = new HttpGet(requestUrl);
            HttpEntity responseEntity = httpClient.execute(httpGet).getEntity();
            if (responseEntity != null) {
                String responseStr = EntityUtils.toString(responseEntity);
                System.out.println("receive: " + responseStr);
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }
}
