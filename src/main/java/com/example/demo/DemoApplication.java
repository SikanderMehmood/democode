package com.example.demo;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	String s = 	StringEscapeUtils.escapeJava("ایران زیبای من");
	String s1 = 	StringEscapeUtils.unescapeJava("\u0627\u06CC\u0631\u0627\u0646 \u0632\u06CC\u0628\u0627\u06CC \u0645\u0646");
	}


}


//	Salman Baig22:01
//		Create a banking Api. Which allows to deposit and credit the balance from the account. Also at any time we can see the bank balance.
//		Quality Attributes:
//		Using coding best practices.
//		SOLID principles.
//		Clear usage of Dependencies injection.
//		Correct usage of Spring Boot annotations.
//		Correct connection with a persistence layer.
//		Coding Assessment
