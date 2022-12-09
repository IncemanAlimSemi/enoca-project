package com.alsein.enoca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alsein.enoca.component.CompanyAndEmployeeMapper;
import com.alsein.enoca.dto.AddEmployeeDto;
import com.alsein.enoca.dto.EmployeeDto;
import com.alsein.enoca.dto.EmployeeShowDto;
import com.alsein.enoca.entity.Company;
import com.alsein.enoca.entity.Employee;
import com.alsein.enoca.repository.CompanyRepository;
import com.alsein.enoca.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	private CompanyRepository companyRepository;
	CompanyAndEmployeeMapper mapper;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository, CompanyRepository companyRepository, CompanyAndEmployeeMapper mapper) {		
		this.employeeRepository = employeeRepository;
		this.companyRepository = companyRepository;
		this.mapper = mapper;
	}
	
	@Override
	public void add(AddEmployeeDto addEmployeeDto) {
		Employee employee = mapper.toEmployee(addEmployeeDto);
		
		employee.setCompany(getCompany(addEmployeeDto.getCompanyId()));
		employeeRepository.save(employee);	
					
	}
	
	@Override
	public void update(EmployeeShowDto employeeShowDto) {
		Optional<Employee> optional = employeeRepository.findById(employeeShowDto.getEmployeeId());
		if(optional.isPresent()) {
			Employee employee = mapper.showDtoToEmployee(employeeShowDto);
			employee.setCompany(getCompany(employeeShowDto.getCompanyId()));
			employeeRepository.save(employee);	
		}	
	}	
	
	@Override
	public void delete(long employeeId) {
		employeeRepository.deleteById(employeeId);
	}
	
	@Override
	public EmployeeShowDto findById(long employeeId) {
		Optional<Employee> optional = employeeRepository.findById(employeeId);
		if(optional.isPresent()) {
			return mapper.employeeToShowDto(optional.get());
		}
		return null;
	}

	@Override
	public List<EmployeeShowDto> findAll() {
		List<Employee> employees = employeeRepository.findAll();
		return mapper.employeesToListShowDto(employees);
	}
	
	public Company getCompany(long companyId) {
		Optional<Company> optional = companyRepository.findById(companyId);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}





}
