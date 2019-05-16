package com.xiey.practice.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author xiey
 * @date 2019/5/15 14:16
 * @description：
 */
@Getter
@Setter
public class DeviceErrCodeReqVo extends ErrCodeVo {

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 故障时间
     */
    private String time;
}
