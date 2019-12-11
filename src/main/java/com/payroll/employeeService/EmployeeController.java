package com.payroll.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeRepository  employeeRepository;
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable Integer id) {
		//return new Employee(101L,"Ram","Kumar",new Date());
		Employee emp= employeeRepository.getOne(id);
		return emp;
		
	}
}
