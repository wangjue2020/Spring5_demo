package com.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.spring"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
