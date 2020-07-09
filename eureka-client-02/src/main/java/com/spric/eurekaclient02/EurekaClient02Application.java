package com.spric.eurekaclient02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaClient02Application
{

  public static void main(String[] args)
  {
    SpringApplication.run(EurekaClient02Application.class, args);
  }

  // @Value(“${xxxx}”)注解从配置文件读取值，并复制给定义的String port
  // @Value("${属性值:dvalue}"):如果找不到属性值，则默认赋值为dvalue
  // @Value读取的是application.yml中配置内容
  @Value("${server.port}")
  String port;

  @GetMapping("/hi")
  // 将请求参数绑定到你控制器的方法参数上
  // 语法：@RequestParam(value=”参数名”,required=”true/false”,defaultValue=””)
  public String sayHi(@RequestParam(value = "name", required = true, defaultValue = "andyten") String name)
  {
    return "hi " + name + ",i am from port:" + port;
  }
}
