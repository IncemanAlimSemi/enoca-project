package com.alsein.enoca.service;

import java.util.List;

import com.alsein.enoca.dto.AddEmployeeDto;
import com.alsein.enoca.dto.EmployeeShowDto;

public interface EmployeeService {

	void add(AddEmployeeDto addDto);
	void update(EmployeeShowDto employeeShowDto);
	void delete(long employeeId);
	EmployeeShowDto findById(long employeeId);
	List<EmployeeShowDto> findAll();
}
