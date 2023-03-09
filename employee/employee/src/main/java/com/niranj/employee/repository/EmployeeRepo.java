package com.niranj.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niranj.employee.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
