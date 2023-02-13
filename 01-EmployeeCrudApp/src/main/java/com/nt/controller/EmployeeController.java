package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.EmployeeRegistration;
import com.nt.service.IEmployeeService;

@Controller
//@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@GetMapping("/")
	public String showHomePage(){
		return "Home";
	}

	@GetMapping("/report")
	public String getAllEmployeesRecord(Map<String , Object> map){
		List<EmployeeRegistration> list = service.getAllEmployees();
		map.put("empsData" , list);
		return "Employees_Report";
	}

	
	@GetMapping("/add")
	public String showEmployeeFormPage(@ModelAttribute("emp") EmployeeRegistration emp){
		emp.setJob("Java Developer");
		 return "Employee_Register";
	}

	
	@PostMapping("/add")
	public String registerEmployeeRecord(Map<String,Object> map, @ModelAttribute("emp") EmployeeRegistration emp){
		String status = service.registerEmployee(emp);
		//using Model Attr keep result in map
		map.put("resultMsg",status);
	List<EmployeeRegistration> list = service.getAllEmployees();
		map.put("empsData" ,list);
		return "Employees_Report";
	}


	@GetMapping("/edit")
	public String  showEditEmployeeFOrm(@RequestParam("eno") Integer eno, @ModelAttribute("emp") EmployeeRegistration emp) {
		//get emp details based on given emp no
		EmployeeRegistration emp1 = service.getOneEmployeeRecordForEdit(eno);
		System.out.println("----------");
		System.out.println(emp);
		System.out.println(emp1);
		//emp=emp1;
		BeanUtils.copyProperties(emp1, emp);
		//return LVN
		return "Employee_Edit";
		
	}
	
	@PostMapping("/edit")
	public String  editEmployee(@ModelAttribute("emp") EmployeeRegistration emp , RedirectAttributes attrs, Map<String,Object> map) {
		String status = service.editEmployee(emp);
		//use flashAttribute here for redirecct only msg 
		attrs.addFlashAttribute("resultMsg", status);
		map.put("resultMsg", status);
		//return LVN
		return "redirect:report";
		//return "Employees_Report";
		
	}
	
	

	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("eno") int eno, Map<String,Object> map,RedirectAttributes attr) {
		//use service
		String result = service.getOneEmployeeRecordForDelete(eno);
		List<EmployeeRegistration> list = service.getAllEmployees();
		//keep results in model attribute
		map.put("resultMsg", result);
		map.put("empsData", list);
		//return LVN
		return "Employees_Report";
	}
}
