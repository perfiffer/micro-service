package com.perfiffer.example.service.impl;

import com.perfiffer.example.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @ClassName:${CLASSNAME}
 * @Description:
 * @author: lurufeng
 * @company: 柠檬科技
 * @date: 2018/2/17
 * @version: v2.7
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String hello(String name) {
        return "hello," + name;
    }

}
