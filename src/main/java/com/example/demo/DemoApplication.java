package com.example.demo;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception{
		try {
			SpringApplication.run(DemoApplication.class, args);
		} catch (Exception e){
			System.out.println("错误le?!."+e);
		}
	}

}
