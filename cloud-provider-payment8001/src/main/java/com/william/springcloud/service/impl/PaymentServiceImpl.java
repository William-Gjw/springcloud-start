package com.william.springcloud.service.impl;

import com.william.springcloud.dao.PaymentDao;
import com.william.springcloud.entity.Payment;
import com.william.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author William Guo
 * @since 2023-03-07 21:56
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
