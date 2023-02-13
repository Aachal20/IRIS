	package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.EmployeeRegistration;

public interface EmployeeRepository extends JpaRepository<EmployeeRegistration, Integer> {

}
