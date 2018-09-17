package com.perfiffer.example.service.impl;

import com.perfiffer.example.service.IHiService;
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
public class HiServiceImpl implements IHiService {

    @Override
    public String hi(String name) {
        return "hi," + name;
    }
}
