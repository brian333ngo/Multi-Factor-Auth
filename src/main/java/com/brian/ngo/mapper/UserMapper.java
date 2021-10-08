package com.brian.ngo.mapper;

import com.brian.ngo.entity.User;
import com.brian.ngo.model.response.UserResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class UserMapper implements Mapper<User> {
    public UserResponse toResponse(User user) {
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(user, response);
        return response;
    }
}
