package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.EmployeeRegistration;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<EmployeeRegistration> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public String registerEmployee(EmployeeRegistration emp) {
		Integer eno = empRepo.save(emp).getEno();
		return "Employee is saved with Id value" +eno;
	}

	@Override
	public EmployeeRegistration  getOneEmployeeRecordForEdit(Integer eno) {
         EmployeeRegistration emp = empRepo.findById(eno).get();
		return  emp;
	}

	@Override
	public String editEmployee(EmployeeRegistration emp) {
		 Integer id = empRepo.save(emp).getEno();
		return "Employee Updated Successfully with" +id+ "ID Value";
	}

	
	@Override
	public String getOneEmployeeRecordForDelete(Integer eno) {
		empRepo.deleteById(eno);
		return +eno+ "Emp No Employee is deleted";

	}

	

}
