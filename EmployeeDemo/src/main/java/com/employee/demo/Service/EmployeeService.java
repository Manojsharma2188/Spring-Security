package com.employee.demo.Service;

import java.util.List;
import java.util.Optional;

import com.employee.demo.model.Employee;

/**
 * 
 * Interface Used employee entity CRUD operation
 * @throws exception
 * @author Manoj
 */
public interface EmployeeService {

	List<Employee> getAllEmployeeService(String name);

	Optional<Employee> getEmployeeById(long id);

	Employee saveEmployee(Employee employee);

	Optional<Employee> updateEmployee(long id);

	void deleteEmployee(long id);

	void deleteAll();

}
