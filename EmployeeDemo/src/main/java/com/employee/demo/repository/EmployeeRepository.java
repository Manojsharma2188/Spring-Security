package com.employee.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.demo.model.Employee;

/**
 * EmployeeRepository to implement the CRUD operation on employee entity
 * @return entity
 * @author Manoj
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByNameContaining(String name);
}
