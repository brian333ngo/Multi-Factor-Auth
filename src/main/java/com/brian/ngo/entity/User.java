package com.brian.ngo.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Table("ss_user")
@Data
public final class User extends BaseEntity {
    private String name;
    private Integer age;
    private String userName;
    private String passWord;
}
