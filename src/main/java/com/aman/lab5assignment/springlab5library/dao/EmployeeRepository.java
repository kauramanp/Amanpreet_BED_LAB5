package com.aman.lab5assignment.springlab5library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aman.lab5assignment.springlab5library.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
