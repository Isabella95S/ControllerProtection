package com.develhope.ControllerProtection.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private Double sum;
    @Column
    private LocalDate data_Erogaz_Salario;

    @OneToOne
    @JoinColumn(nullable = false)
    @JsonIgnore
    private User user;
}
