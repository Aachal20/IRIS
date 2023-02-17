	package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.EmployeeRegistration;

public interface EmployeeRegistrationRepository extends JpaRepository<EmployeeRegistration, Integer> {

}
