package com.iesvdc.tienda.demoioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iesvdc.tienda.demoioc.repo.ClothesRepo;
import com.iesvdc.tienda.demoioc.model.Clothes;



@Controller
@RequestMapping("/clothes")
public class ClothesController {
    
    @Autowired
    ClothesRepo clothesRepo;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("clothesList", clothesRepo);
        return "clothes";
    }

    @GetMapping("/create")
    public String show(Model model){
        model.addAttribute("newClothes", new Clothes());
        return "clothes";
    }

    @GetMapping("/save")
    public String save(@ModelAttribute ("clothes") Clothes clothes){
        clothesRepo.save(clothes);
        return "redirect:/clothes";
    }
    
    
    //Para editar un producto, se debe pasar el id del mismo como parámetro
    public String  showEdit(@PathVariable("id") Integer id,Model model){
        Clothes clothes = clothesRepo.findById(id).get();
        model.addAttribute("clothes", clothes);
        return "clothes";
    }

    public String showDelete(@PathVariable("id") Integer id){
        clothesRepo.deleteById(id);
        return "redirect:/clothes";
    }

}
