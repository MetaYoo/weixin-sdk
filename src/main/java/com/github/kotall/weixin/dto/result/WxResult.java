package com.github.kotall.weixin.dto.result;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 微信响应
 *
 * @author aracwong
 * @version 1.0.0
 */
@Data
@ToString
public class WxResult implements Serializable {

    private String errcode;

    private String errmsg;
}