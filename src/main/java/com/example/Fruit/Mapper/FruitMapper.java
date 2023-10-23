package com.example.Fruit.Mapper;

import com.example.Fruit.data.FruitDto;
import com.example.Fruit.entity.FruitEntity;
import org.springframework.stereotype.Component;

@Component
public class FruitMapper implements EntityMapper<FruitDto, FruitEntity>{
    @Override
    public FruitEntity toEntity(FruitDto fruitDto){
        FruitEntity fruitEntity = new FruitEntity();
        fruitEntity.setFruitName(fruitDto.getFruitName());
        fruitEntity.setFruitWeight(fruitDto.getFruitWeight());
        return fruitEntity;
    }
}
