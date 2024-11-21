package com.edu.i202217368.Project.Maven;

import com.edu.i202217368.Project.Maven.entity.Country;
import com.edu.i202217368.Project.Maven.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ProjectMavenApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {

		SpringApplication.run(ProjectMavenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * ifPresentorElse()
		 */
		Optional<Country> optional = countryRepository.findById("PER");
		optional.ifPresentOrElse(
				(item) -> {
					System.out.println(String.format("Country is %s", item));
				},
				() -> {
					System.out.println("Country is not found");
				});


		/**
		 * delete all by id
		 */

		/*List<Integer> lista = List.of(621,622,623);
		 *//*lista.stream().filter((item) -> {
			return (customerRepository.existsById(item);
		}).collect(Collectors.toList());*//*

		lista.stream().filter(customerRepository::existsById).collect(Collectors.toList());

		customerRepository.deleteAllById(lista);*/



	}
}
