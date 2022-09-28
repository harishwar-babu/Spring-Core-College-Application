package com.collegeapp.pack;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath:college.properties")
@ComponentScan(basePackages="com.collegeapp.pack")
public class CollegeConfig {	
	
}
