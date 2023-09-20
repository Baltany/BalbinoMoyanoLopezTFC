package com.iesvdc.tienda.demoioc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iesvdc.tienda.demoioc.model.Address;
import com.iesvdc.tienda.demoioc.repo.AddressRepo;



@Controller
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
    AddressRepo addressRepo;

    
    @GetMapping("")
    public String list(Model model){
        model.addAttribute("addressList",addressRepo.findAll());
        return "address";
    }

    @GetMapping("/create")
    public String show(Model model){
        model.addAttribute("newAddress",new Address());
        return "address";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("address") Address address){
        addressRepo.save(address);
        return "redirect:/address";
    }


    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model){
        Address address = addressRepo.findById(id).get();
        model.addAttribute("address", address);
        return "address";
    }

    @GetMapping
    public String showDelete(@PathVariable("id") Integer id){
        addressRepo.deleteById(id);
        return "redirect:/address";
    }

}
