package com.greatlearning.ems.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.greatlearning.ems.employee","com.greatlearning.ems.employee.dao","com.greatlearning.ems.employee.entity","com.greatlearning.ems.employee.controller","com.greatlearning.ems.employee.security","com.greatlearning.ems.employee.service"})
public class EmployeemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemsApplication.class, args);
	}

}
