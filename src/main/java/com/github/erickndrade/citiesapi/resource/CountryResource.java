package com.github.erickndrade.citiesapi.resource;

import com.github.erickndrade.citiesapi.domain.Country;
import com.github.erickndrade.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
public Page<Country> countries(Pageable pageable){
        return countryRepository.findAll(pageable);
}

@GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> country = countryRepository.findById(id);
        if (country.isPresent()){
            return ResponseEntity.ok().body(country.get());
        }else
        return ResponseEntity.notFound().build();
}

}
