package com.xiey.practice.demo.api;

import com.alibaba.fastjson.JSON;
import com.xiey.practice.demo.model.DeviceErrCodeReqVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiey
 * @date 2019/5/16 11:23
 * @description：
 */
@RestController
@RequestMapping("test")
@Slf4j
public class TestApi {

    @PostMapping("test")
    public void test(@RequestBody String reqVo) {
        log.error(reqVo);
    }

}
