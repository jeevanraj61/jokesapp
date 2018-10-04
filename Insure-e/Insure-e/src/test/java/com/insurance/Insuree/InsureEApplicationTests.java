package com.insurance.Insuree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.insurance.Insuree.dto.TariffDto;
import com.insurance.Insuree.service.InsuranceService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsureEApplicationTests {
	
	  
	    @Autowired
	    InsuranceService insuranceService;
	    

	@Test
	public void testTariffCalculation() {
		TariffDto tariffDto = new TariffDto(3000L,10,30);
		Double caculatedValue = insuranceService.estimateTariffCalculations(tariffDto).getTariffCalculated();
		 assertEquals(new Double(390),caculatedValue);
	}

}
