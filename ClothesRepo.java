package com.iesvdc.tienda.demoioc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.tienda.demoioc.model.Clothes;

public interface ClothesRepo extends JpaRepository<Clothes,Integer> {
    
}
