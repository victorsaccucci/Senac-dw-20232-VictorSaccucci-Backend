package com.victorsaccucci.Senacdw20232VictorSaccucciBackend.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class Products {
    private String descricao;
    private String fabricante;
    private int valor;
    private int quantidade;
    private LocalDate data;

    public Products(String descricao, String fabricante, int valor, int quantidade, LocalDate data) {
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.valor = valor;
        this.quantidade = quantidade;
        this.data = data;
    }
    public Products(){
        super();
    }
}
