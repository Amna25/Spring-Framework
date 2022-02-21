package com.codeclan.example.employeeService;

import com.codeclan.example.employeeService.models.Employee;
import com.codeclan.example.employeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee = new Employee("Jill", 30,"EMKY78", "jill@gmail.com");
		Employee ross = new Employee("Ross", 25, "RTY765", "Ross@gmail.com");
		employeeRepository.save(employee);
		employeeRepository.save(ross);
	}

}
