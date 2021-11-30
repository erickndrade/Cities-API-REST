package com.github.erickndrade.citiesapi.repository;

import com.github.erickndrade.citiesapi.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
