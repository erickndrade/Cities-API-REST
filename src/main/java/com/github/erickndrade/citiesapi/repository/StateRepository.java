package com.github.erickndrade.citiesapi.repository;

import com.github.erickndrade.citiesapi.domain.Country;
import com.github.erickndrade.citiesapi.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
