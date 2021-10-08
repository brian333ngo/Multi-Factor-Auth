package com.brian.ngo.model.request;

import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private Integer age;
    private String userName;
    private String password;
}
