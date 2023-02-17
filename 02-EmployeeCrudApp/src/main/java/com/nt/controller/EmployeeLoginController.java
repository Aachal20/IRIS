package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.IEmployeeLoginService;


//http://localhost:4041/emp/employee/login/raja@gmail.com/raja@123
//http://localhost:4041/emp/report

@RestController
@RequestMapping("employee")
public class EmployeeLoginController {

	@Autowired
	private IEmployeeLoginService service;

	@GetMapping("login/{email}/{pazz}")
	public String loginEmp(@PathVariable("email") String email,@PathVariable("pazz") String pazzword) {
		System.out.println("EmployeeLoginController.loginEmp()");
		String msg = service.login(email, pazzword);
		return msg;
  }
}
