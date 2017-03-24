package com.yanhaonan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Vegeta on 3/18/17.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = "com.yanhaonan.concert")
public class SpringConfig {
}
