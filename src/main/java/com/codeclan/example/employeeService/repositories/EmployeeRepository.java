package com.codeclan.example.employeeService.repositories;

import com.codeclan.example.employeeService.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
