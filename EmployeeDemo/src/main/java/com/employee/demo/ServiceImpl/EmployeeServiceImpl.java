package com.employee.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.Service.EmployeeService;
import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;

/**
 * 
 * Implementation of CRUD operation, Method override from EmployeeService Used
 * employee entity
 * @author Manoj
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	// Override JPA Repository implementation
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployeeService(String name) {

		List<Employee> employees = new ArrayList<Employee>();

		if (name == null) {
			employeeRepository.findAll().forEach(employees::add);
		} else {
			employeeRepository.findByNameContaining(name).forEach(employees::add);
		}

		return employees;
	}

	// Return employee entity based on ID
	public Optional<Employee> getEmployeeById(long id) {
		Optional<Employee> employeeData = employeeRepository.findById(id);
		return employeeData;
	}

	// Save employee entity based on passed @param employee
	public Employee saveEmployee(Employee employee) {
		Employee _employee = employeeRepository.save(
				new Employee(employee.getName(), employee.getDesignation(), employee.getAge(), employee.getSalary()));
		return _employee;
	}

	// Update employee entity based on passed @param ID
	public Optional<Employee> updateEmployee(long id) {
		Optional<Employee> _employeeData = employeeRepository.findById(id);
		return _employeeData;
	}

	// Delete employee entity based on passed @param ID
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);

	}

	// Delete all employee entity from DB
	public void deleteAll() {
		employeeRepository.deleteAll();

	}

}
