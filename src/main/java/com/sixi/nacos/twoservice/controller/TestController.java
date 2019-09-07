package com.sixi.nacos.twoservice.controller;

import com.sixi.micro.common.utils.KeyValue;
import com.sixi.nacos.oneservice.api.TestApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IDEA
 *
 * @Description: TODO
 * @Author:zhangchongfei
 * @Date:2019/8/30
 * @Time:15:21
 */
@RestController
public class TestController {
    @Resource
    private TestApi testApi;

    @RequestMapping("/test")
    public String test() {
        return testApi.test() + "张重飞";
    }
}
