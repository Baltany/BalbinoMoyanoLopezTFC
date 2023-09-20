package com.iesvdc.tienda.demoioc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.tienda.demoioc.model.Order;

public interface OrderRepo extends JpaRepository<Order,Integer> {
    
}
