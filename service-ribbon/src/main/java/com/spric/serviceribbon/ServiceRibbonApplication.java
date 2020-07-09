package com.spric.serviceribbon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class ServiceRibbonApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(ServiceRibbonApplication.class, args);
  }

  // 用于告诉方法，产生一个Bean对象，然后这个Bean对象交给Spring管理
  // 产生这个Bean对象的方法Spring只会调用一次(在Spring启动时创建)，随后这个Spring将会将这个Bean对象放在自己的IOC容器中
  @Bean
  // 在使用RestTemplate的时候，如果RestTemplate上有这个注解，那么这个RestTemplate调用的远程地址，会走负载均衡器。
  // 如果多个服务注册的是一个名，必须使用@LoadBalanced，否则会报错
  @LoadBalanced
  RestTemplate restTemplate()
  {
    //log.info("====== 产生restTemplate对象 ======");
    return new RestTemplate();
  }
}
