package com.example.news.service.impl;

import com.example.news.converter.NewConverter;
import com.example.news.dto.NewDTO;
import com.example.news.entity.CategoryEntity;
import com.example.news.entity.NewEntity;
import com.example.news.repository.CategoryRepository;
import com.example.news.repository.NewRepository;
import com.example.news.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewService implements INewService {
    @Autowired
    private NewRepository newRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private NewConverter newConverter;

    @Override
    public NewDTO save(NewDTO newDTO) {
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        NewEntity newEntity  = newConverter.toEntity(newDTO);
        newEntity.setCategory(categoryEntity);
        newEntity = newRepository.save(newEntity);
        return newConverter.toDTO(newEntity);
    }
}
