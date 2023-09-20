package com.iesvdc.tienda.demoioc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.tienda.demoioc.model.OrderClothes;

public interface OrderClothesRepo extends JpaRepository<OrderClothes,Integer> {
    
}
