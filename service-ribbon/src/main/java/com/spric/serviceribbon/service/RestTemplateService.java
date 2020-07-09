package com.spric.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version V1.0
 * @className:HelloRibbonService
 * @descripion: TODO
 * @author:andy.ten@tom.com
 * @date:2020/7/3 3:01 下午
 */
@Service
public class RestTemplateService
{
  //@LoadBalanced
  final RestTemplate restTemplate;

  @Autowired
  public RestTemplateService(RestTemplate restTemplate)
  {
    this.restTemplate = restTemplate;
  }

  public String hiService(String name)
  {
    // 使用注册到Eureka服务中心的客户端，由客户端分配具体调用哪个服务
    // 三个参数分别代表 请求地址、请求参数、HTTP响应转换被转换成的对象类型。即服务返回值类型
    // Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign。
    // 使用注册到Eureka服务中心的客户端，由客户端分配具体调用哪个服务
    return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
  }
}
