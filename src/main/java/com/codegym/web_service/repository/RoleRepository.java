package com.codegym.web_service.repository;

import com.codegym.web_service.model.RoleWeather;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleWeather, Long> {
    RoleWeather findByName(String name);
}
