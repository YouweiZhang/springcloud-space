package my.study.cloudali.service.impl;

import my.study.cloud.common.entities.CommonResult;
import my.study.cloud.common.entities.Payment;
import my.study.cloudali.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
