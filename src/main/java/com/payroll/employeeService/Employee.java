package com.payroll.employeeService;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="EMPLOYEE")
@Entity
public class Employee {
	@Id
	@Column(name="Emp_Id")
	private int empId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Joining_Date")
	private Date joingDate;
	
	
	
	public Employee(int empId, String firstName, String lastName, Date joingDate) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joingDate = joingDate;
	}
	
	public Employee() {}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getJoingDate() {
		return joingDate;
	}
	public void setJoingDate(Date joingDate) {
		this.joingDate = joingDate;
	}
	
	
	
}
