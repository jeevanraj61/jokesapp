package com.insurance.Insuree.dataloaders;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.insurance.Insuree.entity.Coverage;
import com.insurance.Insuree.repository.CoverageRepository;

@Component
public class CoverageLoader implements CommandLineRunner {

	private final CoverageRepository repository;

	@Autowired
	public CoverageLoader(CoverageRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {

		Stream.of(new Coverage(0L, 3000L, 30, "0-3K"), new Coverage(500L, 10000L, 5, "500-10K"),
				new Coverage(500L, 6000L, 35, "500-6K"), new Coverage(0L, 20000L, 30, "0-20K"))
				.forEach(coverage -> repository.save(coverage));
		repository.findAll().forEach(System.out::println);

	}

}
