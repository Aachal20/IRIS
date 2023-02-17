package com.test;

import java.util.List;
import java.util.Scanner;



//import org.assertj.core.api.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest2 extends Object {

	private static ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) throws Exception {

		System.out.println("==============JSON To JAVA=======================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Employee Id::");
		System.out.println("Enter a Employee Name:: ");
		System.out.println("Enter a Employee Dept::");
		Integer empId = sc.nextInt();
		String empName = sc.nextLine();
		String empDept = sc.next();




		Employee e1 = new Employee();
		e1.setEno(empId);
		e1.setEname(empName);
		e1.setDept(empDept);

		ObjectMapper mapper = new ObjectMapper();
		String val = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e1);
		System.out.println(val);

	//	isEmployeeExistWithThisName(empName);
		insertDataIntoExistingJSONObject( val);
	}

	public static void insertDataIntoExistingJSONObject(String val) throws JsonMappingException, JsonProcessingException {
	
		String json = "[{\"eno\":101,\"ename\":\"Aachal\",\"dept\":\"Dev\"},{\"eno\":102,\"ename\":\"Raja\",\"dept\":\"Testing\"},{\"eno\":104,\"ename\":\"Ramesh\",\"dept\":\"Of\"}]\r\n "+val;
System.out.println(json);
		String newJsonData = val;
		
		String finalJSON = json+newJsonData;
		System.out.println("==========================");
		List<Employee> listEmp = mapper.readValue(finalJSON, new TypeReference<List<Employee>>() {});
		
		//for (Employee emp : listEmp) {System.out.println(emp)}));

		for(Employee emp1 : listEmp) {
			System.out.println(emp1);
		}
	}
	private static void  isEmployeeExistWithThisName(String empName)
			throws JsonMappingException, JsonProcessingException {

		String json = "[{\"eno\":101,\"ename\":\"Aachal\",\"dept\":\"Dev\"},{\"eno\":102,\"ename\":\"Raja\",\"dept\":\"Testing\"},{\"eno\":104,\"ename\":\"Ramesh\",\"dept\":\"Of\"}]\r\n";

		List<Employee> listEmp = mapper.readValue(json, new TypeReference<List<Employee>>() {});

		/*listEmp.forEach(e->{
			if( empName.equals(e.getEname()))
				System.out.println("Employee Exist in our IRIS Business Company with the Name as " +empName);
		});*/
		//one way
		/**/

		//second way
		/*listEmp.stream().forEach(a-> {
			if( empName.equals(a.getEname()))
				System.out.println("Employee Exist in our IRIS Business Company with the Name as " +empName);
		else 
			System.out.println("Employee not exist");
		});*/

		/*//not working as per my exceptation
		listEmp.forEach(e -> {
			if (empName.equals(e.getEname())) {
				System.out.println("Employee Exist in our IRIS Business Company with the Name as :: " +empName);

			} else {
				System.out.println("Employee Does Not  Exist with  the Name as ::" +empName);
			}
		});*/

		String ename;
		boolean flag = false;
		for (Employee emp : listEmp) {
			ename = emp.getEname();
			/*if(empName.equals(ename)) {
				System.out.println("Employee Exist in our IRIS Business Company with the Name as :: " +empName);
			} else {
				System.out.println("Employee Does Not  Exist with  the Name as ::" +empName);
			}*/

			if (emp.getEname().equalsIgnoreCase(empName)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Employ present");
		} else {
			System.out.println("Employ not present");
		}


		/*    .forEach(i -> {
		    if (i.intValue() % 2 == 0) {
		        Assert.assertTrue(i.intValue() % 2 == 0);
		    } else {
		        Assert.assertTrue(i.intValue() % 2 != 0);
		    }
		});*/

		//third way
		/*	boolean flag = false;
		 	listEmp.forEach(e->{
				if( empName.equals(e.getEname()){
					flag=true;
				}
				return flag;
				);*/
	}	
}
