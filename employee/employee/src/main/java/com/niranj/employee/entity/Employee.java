package com.niranj.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empdb")
public class Employee {
@Id
@Column(name="emp_id")
private int emp_id;
@Column(name="name")
private String name;
@Column(name="stream")
private String stream;
@Column(name="salary")
private int salary;
@Column(name="age")
private int age;
@Column(name="address")
private String address;
@Column(name="mailid")
private String mailid;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public Employee(int emp_id, String name, String stream, int salary, int age, String address, String mailid) {
	super();
	this.emp_id = emp_id;
	this.name = name;
	this.stream = stream;
	this.salary = salary;
	this.age = age;
	this.address = address;
	this.mailid = mailid;
}
public Employee() {
	
}


}
