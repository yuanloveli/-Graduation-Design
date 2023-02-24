package com.dq.springboot_recruit;
/**
 *
 * @author yuanli
 * @date 2023/2/23 21:17
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dq.springboot_recruit.mapper")
@SpringBootApplication
public class StartApplicaiton {
	public static void main(String[] args) {
		SpringApplication.run(StartApplicaiton.class, args);
		System.out.println("Application success running!!!");
	}
}
