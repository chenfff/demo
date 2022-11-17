package com.example.demo.service.impl;

import com.example.demo.service.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {


    @Override
    public String testDemo() {
        //do something ...
        return "this is DemoService";
    }
}
