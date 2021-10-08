package com.brian.ngo.mapper;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface Mapper<T> {
    default <Q> List<Q> toList(List<T> source, Function<T,Q> mapper) {
        return source.stream().map(mapper).collect(Collectors.toList());
    }
}
