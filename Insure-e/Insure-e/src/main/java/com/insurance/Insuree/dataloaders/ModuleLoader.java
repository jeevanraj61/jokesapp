package com.insurance.Insuree.dataloaders;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.insurance.Insuree.entity.Module;
import com.insurance.Insuree.repository.ModuleRepository;

@Component
public class ModuleLoader implements CommandLineRunner {

	private final ModuleRepository repository;

	@Autowired
	public ModuleLoader(ModuleRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {

		Stream.of("Bike", "Jewelry", "Electronics", "Sports Equipment")
				.forEach(name -> repository.save(new Module(name)));
		repository.findAll().forEach(System.out::println);

	}

}
