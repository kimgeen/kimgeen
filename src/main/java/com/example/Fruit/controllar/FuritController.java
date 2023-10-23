package com.example.Fruit.controllar;

import com.example.Fruit.data.FruitDto;
import com.example.Fruit.entity.FruitEntity;
import com.example.Fruit.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FuritController {
    @Autowired
    FruitService fruitService;

    @GetMapping
    public List<FruitEntity> getalls(){
        return fruitService.getall();
    }
    @GetMapping("/{fruitId}")
    public FruitEntity getones(@PathVariable int fruitId){
        return fruitService.getone(fruitId);
    }
    @PostMapping
    public FruitEntity post (@RequestBody FruitDto fruitDto){
        FruitEntity createfruitEntity = fruitService.create(fruitDto);
        return fruitService.create(fruitDto);
    }
}
