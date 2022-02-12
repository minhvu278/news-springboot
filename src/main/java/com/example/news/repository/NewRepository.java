package com.example.news.repository;

import com.example.news.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
}
