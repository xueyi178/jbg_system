package com.jbg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.启动类
 * 项目名称：jbg_system 
 * 类名称：Application
 * 开发者：Lenovo
 * 开发时间：2019年9月11日下午1:16:33
 */
@SpringBootApplication
@MapperScan("com.jbg.mapper")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
