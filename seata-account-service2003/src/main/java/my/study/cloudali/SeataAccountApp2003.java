package my.study.cloudali;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan({"my.study.cloudali.dao"})
public class SeataAccountApp2003 {
    public static void main(String[] args) {
        SpringApplication.run(SeataAccountApp2003.class,args);
    }
}
