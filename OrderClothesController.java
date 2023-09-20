package com.iesvdc.tienda.demoioc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iesvdc.tienda.demoioc.model.OrderClothes;

import com.iesvdc.tienda.demoioc.repo.OrderClothesRepo;


@Controller
@RequestMapping("/orderClothes")
public class OrderClothesController {
    
    @Autowired
    OrderClothesRepo orderClothesRepo;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("orderClothesList", orderClothesRepo);
        return "orderClothes";

    }

    @GetMapping("/create")
    public String show(Model model){
        model.addAttribute("newOrderClothes", new OrderClothes());
        return "orderClothes";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("orderClothes") OrderClothes orderClothes){
        orderClothesRepo.save(orderClothes);
        return "redirect:/orderClothes";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model){
        OrderClothes orderClothes = orderClothesRepo.findById(id).get();
        model.addAttribute("orderClothes", orderClothes);
        return "orderClothes";
    }

    @GetMapping
    public String showDelete(@PathVariable("id") Integer id){
        orderClothesRepo.deleteById(id);
        return "redirect:/orderClothes";
    }



}
