package com.test;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Employee implements  Serializable{

	private int eno;
	private String ename;
	private String dept;


	public Employee() {
		System.out.println("0-param constructor");	
	}
	
	public Employee(int eno, String ename, String dept) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "JsonEmployeeTest [eno=" + eno + ", ename=" + ename + ", dept=" + dept + "]";
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
