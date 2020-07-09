package com.spric.servicefeign.controller;

import com.spric.servicefeign.service.HelloFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @className:HelloRibbonController
 * @descripion: TODO
 * @author:andy.ten@tom.com
 * @date:2020/7/3 3:02 下午
 */
@RestController
@Slf4j
public class HelloFeignController
{

  private final HelloFeignService helloFeignService;

  @Autowired
  public HelloFeignController(HelloFeignService helloFeignService)
  {
    this.helloFeignService = helloFeignService;
  }

  @GetMapping(value = "hi")
  public String sayHi(@RequestParam String name)
  {
    return helloFeignService.sayHiFromClientOne(name);
  }
}
