package com.greatlearning.ems.employee.service;

import java.util.List;

import com.greatlearning.ems.employee.entity.Employee;
import com.greatlearning.ems.employee.entity.Role;
import com.greatlearning.ems.employee.entity.User;



public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(Integer theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstNameAsc();

	public User saveUser(User user);

	public Role saveRole(Role role);
}
