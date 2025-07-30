package com.develhope.ControllerProtection.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private Double sum;
    @Column
    private LocalDate dataErogazSalario;

    @OneToOne
    @JoinColumn(nullable = false)
    @JsonIgnore
    private User user;
}
