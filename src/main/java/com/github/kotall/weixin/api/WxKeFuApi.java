package com.github.kotall.weixin.api;

import com.github.kotall.weixin.dto.custom.WxKeFuReqDto;
import com.github.kotall.weixin.dto.result.WxResult;

/**
 * @author zpwang
 * @version 1.0.0
 */
public interface WxKeFuApi {

    WxResult create(String appId, WxKeFuReqDto wxKeFuReqDto);
}