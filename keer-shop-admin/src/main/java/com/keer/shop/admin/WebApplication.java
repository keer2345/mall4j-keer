package com.keer.shop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author keer
 * @date 2024-03-22
 */
@SpringBootApplication
@ComponentScan("com.keer.shop")
public class WebApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(WebApplication.class, args);
  }

  /**
   * SpringBootServletInitializer让SpringBoot将应用程序以 WAR 包的形式部署在外部的SERVLET容器中
   * （如Tomcat、Jetty、Undertow等)，并提供一种简单的配置外部SERVLET容器的方法。
   */
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(WebApplication.class);
  }
}
