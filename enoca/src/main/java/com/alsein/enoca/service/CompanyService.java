package com.alsein.enoca.service;

import java.util.List;

import com.alsein.enoca.dto.CompanyDto;

public interface CompanyService {
	CompanyDto findById(long companyId); 
	List<CompanyDto> findAll();
}
