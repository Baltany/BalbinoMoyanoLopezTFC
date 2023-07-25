package com.iesvdc.tienda.demoioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iesvdc.tienda.demoioc.model.Clothes;
@RestController
@RequestMapping("api")
@SpringBootApplication
public class DemoiocApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoiocApplication.class, args);

    }

    @GetMapping(value = "clothes")
    public Clothes findClothes() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Clothes miMoto = (Clothes) ac.getBean("clothes");
        return miMoto;
    }

// public static void main( String[] args )
//     {

//         ApplicationContext ac = 
//             new ClassPathXmlApplicationContext("classpath:beans.xml");
//         Clothes miMoto = (Clothes) ac.getBean("clothes");
//         System.out.println(miMoto.toString());
//     }

}
