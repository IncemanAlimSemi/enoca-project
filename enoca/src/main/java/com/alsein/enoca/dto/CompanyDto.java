package com.alsein.enoca.dto;

import java.util.List;

public class CompanyDto {
	
	private String companyName;
	
	private List<EmployeeDto> employeesDto;	

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<EmployeeDto> getEmployeesDto() {
		return employeesDto;
	}

	public void setEmployeesDto(List<EmployeeDto> employeesDto) {
		this.employeesDto = employeesDto;
	}
	
}
