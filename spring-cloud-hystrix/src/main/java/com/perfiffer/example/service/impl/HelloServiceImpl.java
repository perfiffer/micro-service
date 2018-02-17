package com.perfiffer.example.service.impl;

import com.perfiffer.example.service.IHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName:${CLASSNAME}
 * @Description:
 * @author: lurufeng
 * @company: 柠檬科技
 * @date: 2018/2/16
 * @version: v2.7
 */
@Component
public class HelloServiceImpl implements IHelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @Override
    public String hello(String name) {
        return "error";
    }
}
