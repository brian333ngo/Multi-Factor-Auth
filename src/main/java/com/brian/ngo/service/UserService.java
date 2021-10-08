package com.brian.ngo.service;

import com.brian.ngo.entity.User;
import com.brian.ngo.model.response.UserResponse;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserResponse> create(User user);
    Mono<UserResponse> findById(Integer id);
}