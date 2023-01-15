package com.aman.lab5assignment.springlab5library.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.lab5assignment.springlab5library.dao.EmployeeRepository;
import com.aman.lab5assignment.springlab5library.model.Employee;
import com.aman.lab5assignment.springlab5library.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {

		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	@Override
	public Employee findById(long id) {
		Optional<Employee> result = employeeRepository.findById(id);

		Employee employee = null;

		if (result.isPresent()) {
			employee = result.get();
		} else {
			// we didn't find the book
			throw new RuntimeException("Did not find employee id - " + id);
		}

		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(long id) {
		employeeRepository.deleteById(id);
	}

}
