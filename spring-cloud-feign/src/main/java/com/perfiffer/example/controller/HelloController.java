package com.perfiffer.example.controller;

import com.perfiffer.example.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:${CLASSNAME}
 * @Description:
 * @author: lurufeng
 * @company: 柠檬科技
 * @date: 2018/2/14
 * @version: v2.7
 */
@RestController
public class HelloController {

    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return helloService.hello(name);
    }

}
