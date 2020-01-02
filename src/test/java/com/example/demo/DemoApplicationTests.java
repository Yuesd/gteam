package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DemoApplicationTests {

 
	
	@Test
	public void contextLoads() {
	}
	
 
	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		System.out.println("hello ");
		return "李跃";
	}
	

}
