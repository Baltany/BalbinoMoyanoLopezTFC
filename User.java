package com.iesvdc.tienda.demoioc.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //esta puesto como long en el UML
    
    private String firstName;

    private String lastName;

    private String username;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private String dni;

    @OneToMany(mappedBy = "user")
    private List<Address> addresList;

}
