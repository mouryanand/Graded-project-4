package com.greatlearning.ems.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.employee.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();
}
