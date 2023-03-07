package com.william.springcloud.service;

import com.william.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author William Guo
 * @since 2023-03-07 21:55
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
