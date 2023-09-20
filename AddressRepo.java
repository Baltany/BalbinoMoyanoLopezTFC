package com.iesvdc.tienda.demoioc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.tienda.demoioc.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {
    
}
