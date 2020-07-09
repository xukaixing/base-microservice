package com.spric.servicefeign.service;

import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @className:HelloFeignServiceImpl
 * @descripion: TODO
 * @author:andy.ten@tom.com
 * @date:2020/7/8 5:51 下午
 */

@Service
public class HelloFeignServiceImpl implements HelloFeignService
{
  @Override
  public String sayHiFromClientOne(String name)
  {
    return "hello" + name;
  }
}
