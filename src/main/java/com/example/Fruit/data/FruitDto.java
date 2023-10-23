package com.example.Fruit.data;

import com.example.Fruit.entity.FruitEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FruitDto {
    private String fruitName;
    private int fruitWeight;

    public FruitEntity toEntity(){
        return FruitEntity.builder()
                .fruitName(fruitName)
                .fruitWeight(fruitWeight)
                .build();
    }
}
