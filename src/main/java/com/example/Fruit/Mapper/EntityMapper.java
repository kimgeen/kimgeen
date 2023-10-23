package com.example.Fruit.Mapper;

public interface EntityMapper<DTO,Entity>{
    Entity toEntity(DTO dto);
}
