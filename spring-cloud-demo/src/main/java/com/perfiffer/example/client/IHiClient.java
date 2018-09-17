package com.perfiffer.example.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName:${CLASSNAME}
 * @Description:
 * @author: lurufeng
 * @company: 柠檬科技
 * @date: 2018/2/17
 * @version: v2.7
 */
@FeignClient(value = "SPRING-CLOUD-DEMO2")
public interface IHiClient {

    @RequestMapping(value = "/hi")
    String hi(@RequestParam(value = "name") String name);

}
