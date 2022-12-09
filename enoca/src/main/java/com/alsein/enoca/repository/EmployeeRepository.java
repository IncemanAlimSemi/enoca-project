package com.alsein.enoca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alsein.enoca.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
