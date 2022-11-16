package com.example.demo.controller;


import com.plumelog.trace.annotation.Trace;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("demo")
public class DemoController {


    @GetMapping("index")
    public String index(){
        log.info("this is info log");
        log.debug("this is debug log");
        log.warn("this is warn log");
        log.error("this is error log");
        return "hello demo";
    }
}
