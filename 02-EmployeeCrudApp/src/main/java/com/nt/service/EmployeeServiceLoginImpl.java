package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceLoginImpl implements IEmployeeLoginService {

	
	@Override
	public String login(String email, String pazzword) {
		String EmpEmail = "raja@gmail.com";
		String EmpPass = "raja@123";
		if(email.equals(EmpEmail) && pazzword.equals(EmpPass))
			return "Login Successfull";
		else
			return "Please check credentials";
	}

}
