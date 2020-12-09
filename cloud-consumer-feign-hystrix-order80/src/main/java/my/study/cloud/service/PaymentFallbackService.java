package my.study.cloud.service;

import org.springframework.stereotype.Component;

/**
 * 服务降级类
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "========服务降级类PaymentFallbackService paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "========服务降级类PaymentFallbackService paymentInfo_TimeOut";
    }
}
