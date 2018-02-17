package com.perfiffer.example.service;

import com.perfiffer.example.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName:${CLASSNAME}
 * @Description:
 * @author: lurufeng
 * @company: 柠檬科技
 * @date: 2018/2/16
 * @version: v2.7
 */
@FeignClient(value = "SPRING-CLOUD-DEMO", fallback = HelloServiceImpl.class)
public interface IHelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name);

}
