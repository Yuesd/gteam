package com.cqut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Customer;

@SpringBootApplication
@RestController
@MapperScan("com.cqut.dao")
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/customer/addCustomeraa")
	public String addCustomer(Customer cus ) {
		//System.out.println(cus);测试字符编码
		return "ok";
	}

}
