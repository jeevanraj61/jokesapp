package com.insurance.Insuree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.Insuree.entity.Coverage;

@Repository
public interface CoverageRepository extends JpaRepository<Coverage,Long>{

}

