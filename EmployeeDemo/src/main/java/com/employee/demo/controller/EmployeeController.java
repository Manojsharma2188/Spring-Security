package com.employee.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.Service.EmployeeService;
import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;

/**
 * Attempts to implement the CRUD operation on employee entity
 * @return response entity
 * @author Manoj
 */
@CrossOrigin(origins = "http://localhost:4300")
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/**
	 * @param getAllEmployees (name) - Return list of employees
	 * @return response entity
	 */
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String name) {
		try {
			List<Employee> employees = employeeService.getAllEmployeeService(name);

			if (employees.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(employees, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * @param getEmployeeById (ID) - Return list of employee on ID
	 * @return response entity
	 */
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {

		Optional<Employee> employeeData = employeeService.getEmployeeById(id);

		if (employeeData.isPresent()) {
			return new ResponseEntity<>(employeeData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/**
	 * @param saveEmployee (Employee) - Saving employee entity in database
	 * @return response entity
	 */
	@PostMapping("/employees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		try {

			Employee _employee = employeeService.saveEmployee(employee);

			return new ResponseEntity<>(_employee, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * @param updateEmployee (Employee, ID) - Updating employee entity in database
	 * @return response entity
	 */
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
         System.out.println("ID vALUE FOR UPDATE " + id);
         System.out.println("ID vALUE in employee FOR UPDATE " + employee.getId());
         System.out.println("ID vALUE in employee FOR UPDATE " + employee.getName());
         System.out.println("ID vALUE in employee FOR UPDATE " + employee.getAge());


		Optional<Employee> _employeeData = employeeService.updateEmployee(id);
        employee.setId(id);
		if (_employeeData.isPresent()) {
			Employee _employee = _employeeData.get();
			_employee.setName(employee.getName());
			_employee.setDesignation(employee.getDesignation());
			_employee.setAge(employee.getAge());
			_employee.setSalary(employee.getSalary());

			return new ResponseEntity<>(employeeService.saveEmployee(_employee), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/**
	 * @param deleteEmployee (ID) - Delete employee entity in database
	 * @return response entity
	 */
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") long id) {
		try {

			employeeService.deleteEmployee(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * @param deleteAllEmployees - Delete all employee entity in database
	 * @return response entity
	 */
	@DeleteMapping("/employees")
	public ResponseEntity<HttpStatus> deleteAllEmployees() {
		try {
			employeeService.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
