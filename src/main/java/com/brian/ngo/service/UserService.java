package com.brian.ngo.service;

import com.brian.ngo.entity.User;
import com.brian.ngo.model.request.UserRequest;
import com.brian.ngo.model.response.UserResponse;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserResponse> create(UserRequest user);
    Mono<UserResponse> findById(Integer id);
}