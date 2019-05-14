package com.xiey.practice.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiey
 * @date 2019/5/14 11:56
 * @description：
 */
@RestController
public class GetPropertyFromConfigServerController {


    @Value("${com.springcloud.xy.message}")
    String message;

    @GetMapping("/getPropertyFromConfigServer")
    public String getPropertyFromConfigServer() {
        String msg = "hello, i am " + message + ", i'm come from config server";
        System.out.println(msg);
        return msg;
    }

}