package com.spric.serviceribbon.controller;

import com.spric.serviceribbon.service.RestTemplateService;
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
public class HelloRibbonController
{

  final RestTemplateService restTemplateService;

  @Autowired
  public HelloRibbonController(RestTemplateService helloRibbonService)
  {
    this.restTemplateService = helloRibbonService;
  }

  @GetMapping(value = "/hi")
  public String hi(@RequestParam String name)
  {
    return restTemplateService.hiService(name);
  }
}
