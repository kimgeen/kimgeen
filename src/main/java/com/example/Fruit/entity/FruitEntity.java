package com.example.Fruit.entity;

import com.example.Fruit.data.FruitDto;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Fruit")
public class FruitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fruitId;
    private String fruitName;
    private int fruitWeight;

    public FruitDto todto(){
        return FruitDto.builder()
                .fruitName(fruitName)
                .fruitWeight(fruitWeight)
                .build();
    }
}
