package com.niranj.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niranj.employee.entity.Employee;
import com.niranj.employee.service.EmployeeService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService empse;
	
	@GetMapping ("/getEmp")
	public List<Employee>getDetails()
	{
		return empse.getAllDetails();
	}
	@GetMapping ("/getEmp/{id}")
	public Optional<Employee> getDetails(@PathVariable int id)
	{
		return empse.getAllDetails(id);
	}
	@PostMapping("/addEmp")
	public Employee postDetails (@RequestBody Employee e)
	{
		return empse.addDetails(e);
		
	}
	@PutMapping("/putEmp/{id}")
	public String putDetails(@RequestBody Employee e ) {
		return empse.changeDetails(e);
	}
	
	@DeleteMapping("/delEmp/{id}")
	public void deletedetails(@PathVariable("id") int id)
	{
		empse.deleteDetails(id);
	}
}

