package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author WangXiaoshuai
 * @create 2020-05-31 16:16
 */
@RestController
@RequestMapping(value = "/order")
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        CommonResult forObject = restTemplate.getForObject(PAYMENT_URL + "/payment/getPaymentById/" + id, CommonResult.class);
        return forObject;
    }

    @GetMapping(value ="/consumer/create")
    public CommonResult create(@RequestBody Payment payment) {
        CommonResult forObject = restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
        return forObject;
    }
}
