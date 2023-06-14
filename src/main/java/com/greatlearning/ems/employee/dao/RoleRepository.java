package com.greatlearning.ems.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.employee.entity.Role;



public interface RoleRepository extends JpaRepository<Role, Integer> {

}
