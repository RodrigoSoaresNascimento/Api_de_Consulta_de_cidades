package com.github.rodrigosoares.citiesnortheastapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.rodrigosoares.citiesnortheastapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository <Country, Long> {

}
