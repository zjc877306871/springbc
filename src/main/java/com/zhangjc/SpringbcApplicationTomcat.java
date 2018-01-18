package com.zhangjc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 打war包后springboot启动的入口
 */
@SpringBootApplication
@MapperScan(basePackages="com.zhangjc.jdbc.mapper")
public class SpringbcApplicationTomcat extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbcApplicationTomcat.class);
	}

		public static void main(String[] args) {
		SpringApplication.run(SpringbcApplicationTomcat.class, args);
	}
}
