package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author WangXiaoshuai
 * @create 2020-05-27 22:30
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        if (i > 0) {
            return CommonResult.success("插入数据成功", i);
        } else {
            return CommonResult.fail("插入数据失败", null);
        }
    }
    @GetMapping(value = "/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment i = paymentService.getPaymentById(id);
        if (i != null) {
            return CommonResult.success("查询成功", i);
        } else {
            return CommonResult.fail("查询失败", null);
        }
    }
}
