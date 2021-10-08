package com.brian.ngo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    @Id
    private Integer id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String creadteddBy;
    private String updateddBy;
    private boolean isDeleted;
}
