package com.codegym.web_service.repository;

import com.codegym.web_service.model.UserWeather;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserWeather, Long> {
    UserWeather findByEmail(String email);
}
