package com.victorsaccucci.Senacdw20232VictorSaccucciBackend.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_product")
    private String name;
    private String producer;
    @Column(name = "value_product")
    private Double value;
    private Double weight;
    private LocalDate registerDate;

    public Product(long id, String name, String producer, Double value, Double weight, LocalDate registerDate) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.value = value;
        this.weight = weight;
        this.registerDate = registerDate;
    }

    public Product(){
        super();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public Double getValue() {
        return value;
    }

    public Double getWeight() {
        return weight;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
