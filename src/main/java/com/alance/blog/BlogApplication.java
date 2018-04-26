package com.alance.blog;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 启动类
 * @author yanlong
 */
@SpringBootApplication
@MapperScan("com.alance.blog.mapper")
@EnableAutoConfiguration
@EnableCaching
@Slf4j
public class BlogApplication {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		SpringApplication.run(BlogApplication.class, args);
		log.info("项目启动完毕！耗时："+(System.currentTimeMillis()-start)+"ms");
	}
}
