package com.example.news.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Date created_at;
    @Column
    private Date updated_at;

    public Long getId() {
        return id;
    }
}
