package com.springmvc.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.employeemanagement.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
