package com.nt.service;

import java.util.List;

import com.nt.model.EmployeeRegistration;

public interface IEmployeeService {

	public List<EmployeeRegistration> getAllEmployees();
	public String registerEmployee(EmployeeRegistration emp);
	public EmployeeRegistration getOneEmployeeRecordForEdit(Integer eno);
	public String editEmployee(EmployeeRegistration emp);
	public String getOneEmployeeRecordForDelete(Integer eno);
}
