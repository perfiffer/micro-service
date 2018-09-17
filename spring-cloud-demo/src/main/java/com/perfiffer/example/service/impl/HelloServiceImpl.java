package com.perfiffer.example.service.impl;

import com.perfiffer.example.client.IHiClient;
import com.perfiffer.example.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: HelloServiceImpl
 * @Description:
 * @author: perfiffer
 * @company: 柠檬科技
 * @date: 2018/2/17
 * @version: v2.7
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    IHiClient hiClient;

    @Override
    public String hello(String name) {
        return hiClient.hi(name);
    }

}
