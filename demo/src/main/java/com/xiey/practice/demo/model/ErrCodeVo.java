package com.xiey.practice.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xiey
 * @date 2019/5/15 14:21
 * @description：
 */
@Getter
@Setter
public class ErrCodeVo {

    /**
     * 设备识别码
     */
    private String ak;

    /**
     * 错误码
     */
    private String errorCode;
}
