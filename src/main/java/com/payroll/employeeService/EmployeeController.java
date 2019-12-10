package com.payroll.employeeService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeRepository  employeeRepository;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		//return new Employee(101L,"Ram","Kumar",new Date());
		Employee emp= employeeRepository.findOne(id);
		return emp;
		
	}
}
