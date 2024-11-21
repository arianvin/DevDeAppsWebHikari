package com.edu.i202217368.Project.Maven.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private Double SurfaceArea;
    private Integer IndepYear;
    private Integer Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;



}
