package com.alsein.enoca.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alsein.enoca.component.CompanyAndEmployeeMapper;
import com.alsein.enoca.dto.CompanyDto;
import com.alsein.enoca.entity.Company;
import com.alsein.enoca.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	CompanyRepository companyRepository;
	CompanyAndEmployeeMapper mapper;
	
	@Autowired
	public CompanyServiceImpl(CompanyRepository companyRepository, CompanyAndEmployeeMapper mapper) {
		this.companyRepository = companyRepository;
		this.mapper = mapper;
	}
	
	@Override
	public List<CompanyDto> findAll() {
		List<Company> companies = this.companyRepository.findAll();
		return mapper.toCompaniesDto(companies);
	}

	@Override
	public CompanyDto findById(long companyId) {
		Optional<Company> optional = companyRepository.findById(companyId);
		if(optional.isPresent()) return mapper.toCompanyDto(optional.get());
		return null;
	}

	
	
}
