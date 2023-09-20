package com.iesvdc.tienda.demoioc.model;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
// import jakarta.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //esta puesto como long en el UML
    
    @Enumerated(EnumType.STRING)
    private SizeType sizeType;

    private String description;

    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;

    private String image;

    private double price;

    @Enumerated(EnumType.STRING)
    private ColorType colorType;

    private int stock;

}
