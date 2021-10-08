package com.brian.ngo.controller;

import com.brian.ngo.model.request.UserRequest;
import com.brian.ngo.model.response.UserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/users")
public class UserController {
    @PostMapping
    public Mono<UserResponse> create(UserRequest user) {
        return Mono.empty();
    }
}
