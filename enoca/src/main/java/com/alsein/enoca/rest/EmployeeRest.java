package com.alsein.enoca.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alsein.enoca.dto.AddEmployeeDto;
import com.alsein.enoca.dto.EmployeeShowDto;
import com.alsein.enoca.service.EmployeeService;

@RestController
public class EmployeeRest {

	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRest(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/api/add")
	public void add(@RequestBody AddEmployeeDto addDto) {
		employeeService.add(addDto);
	}
	
	@PutMapping("/api/update")
	public void add(@RequestBody EmployeeShowDto employeeShowDto) {
		employeeService.update(employeeShowDto);
	}
	
	@DeleteMapping("/api/update/{employeeId}")
	public void delete(@PathVariable long employeeId) {
		employeeService.delete(employeeId);
	}
	
	@GetMapping("/api/findEmployee/{employeeId}")
	public EmployeeShowDto findById(@PathVariable long employeeId) {
		return employeeService.findById(employeeId);
	}
	
	@GetMapping("/api/findAllEmployee")
	public List<EmployeeShowDto> findAll() {
		return employeeService.findAll();
	}
}
