package com.example.Fruit.service;

import com.example.Fruit.Dao.FruitRepository;
import com.example.Fruit.Mapper.FruitMapper;
import com.example.Fruit.data.FruitDto;
import com.example.Fruit.entity.FruitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class FruitService {
    @Autowired
    private FruitRepository fruitRepository;
    private FruitMapper fruitMapper;

    public List<FruitEntity> getall(){
        return fruitRepository.findAll();
    }
    public FruitEntity getone (int fruitId){
        return fruitRepository.findById(fruitId).orElse(null);
    }
    public FruitEntity create(FruitDto fruitDto){
        FruitEntity fruitEntity = fruitMapper.toEntity(fruitDto);
        return fruitRepository.save(fruitEntity);
    }
    public FruitEntity updataFruit(int fruitId,FruitDto fruitDto){
        FruitEntity fruitupdata = fruitRepository.findById(fruitId).orElse(null);
        if (fruitupdata!=null){
            FruitEntity updata = fruitMapper.toEntity(fruitDto);
            fruitupdata.setFruitId(fruitId);
            return fruitRepository.save(fruitupdata);
        }
        return null;
    }
    public void Delete(int fruitId){
        fruitRepository.deleteById(fruitId);
    }

}
