package com.test;

import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONObject;

//import org.assertj.core.api.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest3 extends Object {

	private static ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) throws Exception {

		System.out.println("==============JSON To JAVA=======================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Employee Id::");
		System.out.println("Enter a Employee Name:: ");
		System.out.println("Enter a Employee Dept::");
		Integer empId = sc.nextInt();
		String empName = sc.nextLine();
		String empDept = sc.nextLine();

		JSONObject obj = new JSONObject();
		obj.put("EmpNo",empId);
		obj.put("EmpName", empName);
		obj.put("empDept",empDept);

		
		
		Employee e1 = new Employee();
		e1.setEno(empId);
		e1.setEname(empName);
		e1.setDept(empDept);

		ObjectMapper mapper = new ObjectMapper();
		String val = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e1);
		System.out.println(val);
		Employee value = mapper.readValue(val, Employee.class);
		//	isEmployeeExistWithThisName(empName);
		insertDataIntoExistingJSONObject(value);
	}

	public static void insertDataIntoExistingJSONObject(Employee value) throws JsonMappingException, JsonProcessingException {

		String json = "[{\"eno\":101,\"ename\":\"Aachal\",\"dept\":\"Dev\"},{\"eno\":102,\"ename\":\"Raja\",\"dept\":\"Testing\"},{\"eno\":104,\"ename\":\"Ramesh\",\"dept\":\"Of\"}]\r\n "+value;
		
  System.out.println(json);
	
		System.out.println("==========================");
		//List<Employee> listEmp = mapper.readValue(json, new TypeReference<List<Employee>>() {});
		List<Employee> listEmp = mapper.readValue(json, new TypeReference<List<Employee>>() {});

		
		String asString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listEmp);
		System.out.println(asString);

		//for (Employee emp : listEmp) {System.out.println(emp)}));s

		/*	for(Employee emp1 : listEmp) {
				System.out.println(emp1);
			}*/
		
	}

}
