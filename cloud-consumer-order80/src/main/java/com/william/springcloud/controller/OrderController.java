package com.william.springcloud.controller;

import com.william.springcloud.common.Result;
import com.william.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 *
 * @author William Guo
 * @since 2023-03-08 13:04
 */
@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment")
    public Result<Payment> create(Payment payment){

        return restTemplate.postForObject(PAYMENT_URL + "/payment", payment, Result.class);
    }

    @GetMapping("/consumer/payment/{id}")
    public Result<String> getPayment(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, Result.class);
    }
}
