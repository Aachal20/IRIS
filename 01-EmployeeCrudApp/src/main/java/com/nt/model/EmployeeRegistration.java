package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="iris_employee_tbl")

public class EmployeeRegistration  implements Serializable{
	
	@Id
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer eno;
	
	@Column(length=20)
	private String ename;
	
	@Column(length=20)
	private String job;
	
	@Column(length=20)
	private String salary;

}
