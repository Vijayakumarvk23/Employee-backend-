package com.niranj.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niranj.employee.entity.Employee;
import com.niranj.employee.repository.EmployeeRepo;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepo emp;
public Employee  addDetails(Employee e)
{
return emp.save(e);
}
public List<Employee>getAllDetails()
{

return emp.findAll();
}
public Optional<Employee> getAllDetails(int id)
{

return emp.findById(id);
}
public String changeDetails(Employee e) {
emp.save(e);
return "updated";
}
public void deleteDetails(int id)
{
emp.deleteById(id);
}
}
