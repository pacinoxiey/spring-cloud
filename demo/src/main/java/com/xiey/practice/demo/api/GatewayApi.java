package com.xiey.practice.demo.api;

import com.xiey.practice.demo.model.BaseReq;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiey
 * @date 2019/5/10 10:23
 * @description：供给gateway代理
 */
@RestController
@RequestMapping("gateWay")
public class GatewayApi {

    @GetMapping("/demo")
    public String demo() {
        return "gateWay";
    }

    @GetMapping("/value")
    public String value(@RequestParam("key") String key) {
        return key;
    }

    @PostMapping("post")
    public String post(@RequestBody BaseReq req) {
        return req.getId();
    }
}
