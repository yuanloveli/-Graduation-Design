package com.dq.springboot_recruit;
/**
* @author 作者:软件2班dq
* @version 创建时间：2021年4月8日 上午09:51:43
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
