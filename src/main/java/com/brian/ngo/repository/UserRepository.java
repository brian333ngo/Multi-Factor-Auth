package com.brian.ngo.repository;

import com.brian.ngo.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends R2dbcRepository<User, Integer> {
}
