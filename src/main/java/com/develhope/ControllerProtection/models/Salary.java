package com.develhope.ControllerProtection.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer sum;
    @Column
    private LocalDate data_Erogaz_Salario;
}
