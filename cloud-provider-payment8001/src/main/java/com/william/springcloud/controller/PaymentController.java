package com.william.springcloud.controller;

import com.william.springcloud.common.Result;
import com.william.springcloud.entity.Payment;
import com.william.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * @author William Guo
 * @since 2023-03-07 21:58
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment")
    public Result<String> save(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("*****插入数据：{}",result);
        if (result>0){
            return Result.success("插入成功");
        }else {
            return Result.error("插入失败");
        }
    }

    @GetMapping("/payment/{id}")
    public Result<Payment> getPayment(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null){
            return Result.success(payment);
        }
        return Result.error("查询失败");
    }

}
