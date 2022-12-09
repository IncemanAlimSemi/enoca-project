package com.alsein.enoca.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alsein.enoca.dto.CompanyDto;
import com.alsein.enoca.service.CompanyService;


@RestController
public class CompanyRest {

	CompanyService companyService;
	
	public CompanyRest(CompanyService companyService) {
		this.companyService = companyService;
	}
	
	@GetMapping("/api/findAllCompany")
	public List<CompanyDto> findAll() {
		return companyService.findAll();
	}
	
	@GetMapping("/api/findCompanyById/{companyId}")
	public CompanyDto findAll(@PathVariable long companyId) {
		return companyService.findById(companyId);
	}
	
}
