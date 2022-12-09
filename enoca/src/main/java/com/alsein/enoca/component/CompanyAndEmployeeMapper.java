package com.alsein.enoca.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.alsein.enoca.dto.AddEmployeeDto;
import com.alsein.enoca.dto.CompanyDto;
import com.alsein.enoca.dto.EmployeeDto;
import com.alsein.enoca.dto.EmployeeShowDto;
import com.alsein.enoca.entity.Company;
import com.alsein.enoca.entity.Employee;
import com.alsein.enoca.repository.CompanyRepository;

@Component
public class CompanyAndEmployeeMapper {
	
	
	
	public CompanyAndEmployeeMapper() {
	
	}
	
	public CompanyDto toCompanyDto(Company company) {
		CompanyDto companyDto = new CompanyDto();
		
		companyDto.setCompanyName(company.getCompanyName());
		companyDto.setEmployeesDto(toEmployeesDto(company.getEmployees()));
		
		return companyDto;
	}
	
	public List<CompanyDto> toCompaniesDto(List<Company> companies) {
		List<CompanyDto> companiesDto = new ArrayList<>();
		
		for (Company company : companies) {
			CompanyDto companyDto = new CompanyDto();
			companyDto.setCompanyName(company.getCompanyName());
			companyDto.setEmployeesDto(toEmployeesDto(company.getEmployees()));
			companiesDto.add(companyDto);
		}
		
		return companiesDto;
	}
	
	public List<EmployeeDto> toEmployeesDto(List<Employee> employees) {
		List<EmployeeDto> employeesDto = new ArrayList<>();
		
		for (Employee employee : employees) {
			EmployeeDto employeeDto = new EmployeeDto();
			employeeDto.setEmployeeId(employee.getEmployeeId());
			employeeDto.setEmployeeName(employee.getEmployeeName());
			employeeDto.setMonthlySalary(employee.getMonthlySalary());
			employeesDto.add(employeeDto);
		}
		
		return employeesDto;
	}
	
	public Employee toEmployee(AddEmployeeDto addDto) {
		Employee employee = new Employee();
		employee.setEmployeeName(addDto.getEmployeeName());
		employee.setMonthlySalary(addDto.getMonthlySalary());
			
		return employee;
	}
	
	public Employee showDtoToEmployee(EmployeeShowDto employeeShowDto) {
		Employee employee = new Employee();
		employee.setEmployeeId(employeeShowDto.getEmployeeId());
		employee.setEmployeeName(employeeShowDto.getEmployeeName());
		employee.setMonthlySalary(employeeShowDto.getMonthlySalary());
		
		return employee;
	}
	
	public EmployeeShowDto employeeToShowDto(Employee employee) {
		EmployeeShowDto employeeShowDto = new EmployeeShowDto();
		employeeShowDto.setEmployeeId(employee.getEmployeeId());
		employeeShowDto.setEmployeeName(employee.getEmployeeName());
		employeeShowDto.setMonthlySalary(employee.getMonthlySalary());
		employeeShowDto.setCompanyId(employee.getCompany().getCompanyId());
		return employeeShowDto;
	}
	
	public List<EmployeeShowDto> employeesToListShowDto(List<Employee> employees) {
		List<EmployeeShowDto> list = new ArrayList<>();
		for (Employee employee : employees) {
			EmployeeShowDto employeeShowDto = new EmployeeShowDto();
			employeeShowDto.setCompanyId(employee.getCompany().getCompanyId());
			employeeShowDto.setEmployeeId(employee.getEmployeeId());
			employeeShowDto.setEmployeeName(employee.getEmployeeName());
			employeeShowDto.setMonthlySalary(employee.getMonthlySalary());
			list.add(employeeShowDto);
		}
		
		return list;
	}
}
