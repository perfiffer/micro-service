package com.perfiffer.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName:${CLASSNAME}
 * @Description:
 * @author: lurufeng
 * @company: 柠檬科技
 * @date: 2018/2/14
 * @version: v2.7
 */
@FeignClient(value = "SPRING-CLOUD-DEMO")
public interface IHelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    String hello(String name);

}
