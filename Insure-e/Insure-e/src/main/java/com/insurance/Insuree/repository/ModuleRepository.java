package com.insurance.Insuree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.Insuree.entity.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module,Long>{

}
