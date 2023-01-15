package com.aman.lab5assignment.springlab5library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aman.lab5assignment.springlab5library.model.Employee;

@Service
public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(long id);

	public void save(Employee employee);

	public void deleteById(long id);
}
