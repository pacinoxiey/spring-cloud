package com.xiey.practice.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xiey
 * @date 2019/5/15 14:16
 * @description：
 */
@Getter
@Setter
@ToString
public class DeviceErrCodeReqVo {

    /**
     * 事件类型
     */
    private String event;
    /**
     * 设备识别码
     */
    private String deviceId;

    /**
     * 故障时间
     */
    private Long timestamp;

    /**
     * data
     */
    private Object data;


}