package com.example.news.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "role")
public class RoleEntity  extends BaseEntity{
    @Column
    private String code;

    @Column
    private String name;
}
