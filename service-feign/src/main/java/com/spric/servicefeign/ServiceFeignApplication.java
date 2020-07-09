package com.spric.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 开启Feign的功能，Edware版本后可省略该注解
@EnableFeignClients
public class ServiceFeignApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(ServiceFeignApplication.class, args);
  }

}
