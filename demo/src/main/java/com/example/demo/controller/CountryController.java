
package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.LifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.*;
import com.example.demo.entity.*;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	CountryRepository countryRepository;

	// insert new country into database
	@PostMapping("/add")
	public Country addCountry(@RequestBody Country c) {
       return countryRepository.save(c);
		
	}

	// fetch all country list from database
	@GetMapping("/all")
	public List<Country> allCountry() {

		return countryRepository.findAll();
	}

	// fetch specific country by their ID
	@GetMapping("/{countryId}")
	public Optional<Country> countryById(@PathVariable("countryId") int countryId) {

		return countryRepository.findById(countryId);
	}

	// update existing country
	@PutMapping("/update")
	public Country updateCountry(@RequestBody Country country) {

		return countryRepository.save(country);
	}

	// delete country from database
	@DeleteMapping("/{countryId}")
	public void deleteCountry(@PathVariable("countryId") int countryId) {

		countryRepository.deleteById(countryId);
	}
}