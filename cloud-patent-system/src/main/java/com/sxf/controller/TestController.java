package com.sxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：huang_qh@suixingpay.com
 * @date ：Created in 2019/11/18 16:21
 * @description：test
 * @version: 0.1$
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
