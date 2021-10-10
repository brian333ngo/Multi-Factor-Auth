package com.brian.ngo.controller;

import com.brian.ngo.model.request.UserRequest;
import com.brian.ngo.model.response.UserResponse;
import com.brian.ngo.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Log4j2
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@RestController
@RequestMapping("/users")
public final class UserController {
    final UserService userService;

    @PostMapping
    public Mono<UserResponse> create(@RequestBody UserRequest user) {
        log.info("user : {}", user);
        return userService.create(user);
    }
}
