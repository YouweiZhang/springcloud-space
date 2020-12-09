package my.study.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import my.study.cloud.common.entities.CommonResult;
import my.study.cloud.common.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ZKOrderController {


    public static final String PAYMENT_URL="http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String create(Payment payment){
        log.info("订单消费者远程调用支付服务");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }



}
