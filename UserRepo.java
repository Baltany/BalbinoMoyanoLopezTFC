package com.iesvdc.tienda.demoioc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesvdc.tienda.demoioc.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}
