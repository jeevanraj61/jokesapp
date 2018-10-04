package com.insurance.Insuree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.Insuree.entity.Tariff;
@Repository
public interface TariffRepository extends JpaRepository<Tariff,Long>{

}
