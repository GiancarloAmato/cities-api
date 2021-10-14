package com.github.GiancarloAmato.citiesapi.countries.repository;

import com.github.GiancarloAmato.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
