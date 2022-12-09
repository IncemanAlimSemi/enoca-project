package com.alsein.enoca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alsein.enoca.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
