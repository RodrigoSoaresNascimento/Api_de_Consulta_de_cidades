package com.github.rodrigosoares.citiesnortheastapi.countries.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rodrigosoares.citiesnortheastapi.countries.entities.Country;
import com.github.rodrigosoares.citiesnortheastapi.countries.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	private CountryRepository repository;
	
	public CountryResource(CountryRepository repository) {
		this.repository = repository;
		
	}
	
	@GetMapping
	public List<Country> cities(){
		
		return repository.findAll();
		
	}
	
}
