package com.iesvdc.tienda.demoioc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Aquí va lo que voya poner en la pagina principal de la tienda de ropa
 */
@Controller
public class MainController {
    
    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping
    public String showHelp(){
        return "help";
    }






}
