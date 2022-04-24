package com.example.cadastroveiculo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String modelo;

    @Column
    private Brand brand;

    @Column
    private Double aceleracao;

    @Column
    private Integer velocidadeMaxima;

}
