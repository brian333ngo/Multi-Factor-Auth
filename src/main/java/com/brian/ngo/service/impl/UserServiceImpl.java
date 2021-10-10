package com.brian.ngo.service.impl;

import com.brian.ngo.entity.User;
import com.brian.ngo.mapper.UserMapper;
import com.brian.ngo.model.request.UserRequest;
import com.brian.ngo.model.response.UserResponse;
import com.brian.ngo.repository.UserRepository;
import com.brian.ngo.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.function.Function;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Service
public class UserServiceImpl implements UserService {
    final UserRepository repository;
    final UserMapper mapper;

    @Override
    public Mono<UserResponse> create(UserRequest user) {
        Function<User, UserResponse> toResponse = mapper::toResponse;
        return repository.save(mapper.toEntity(user)).map(mapper::toResponse);
    }

    @Override
    public Mono<UserResponse> findById(Integer id) {
        return null;
    }
}
