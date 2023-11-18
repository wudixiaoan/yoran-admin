package com.yoran.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yoran.admin.mbg.mapper")
public class MyBatisConfig {
}
