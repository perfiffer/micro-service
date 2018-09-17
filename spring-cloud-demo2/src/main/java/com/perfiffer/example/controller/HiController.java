package com.perfiffer.example.controller;

import com.perfiffer.example.service.IHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:${CLASSNAME}
 * @Description:
 * @author: lurufeng
 * @company: 柠檬科技
 * @date: 2018/2/17
 * @version: v2.7
 */
@RestController
public class HiController {

    @Autowired
    IHiService hiService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return hiService.hi(name);
    }

}
