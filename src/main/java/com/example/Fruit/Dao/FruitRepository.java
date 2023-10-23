package com.example.Fruit.Dao;

import com.example.Fruit.entity.FruitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<FruitEntity, Integer> {
}
