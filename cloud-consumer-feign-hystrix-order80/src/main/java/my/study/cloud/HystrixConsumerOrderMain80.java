package my.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixConsumerOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerOrderMain80.class,args);
    }
}
