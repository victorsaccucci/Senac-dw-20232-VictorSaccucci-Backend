package com.victorsaccucci.Senacdw20232VictorSaccucciBackend.controller;

import com.victorsaccucci.Senacdw20232VictorSaccucciBackend.entity.Product;
import com.victorsaccucci.Senacdw20232VictorSaccucciBackend.reporsitory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping(path = "/todos")
    public ArrayList<Product> listAll(){
        return (ArrayList<Product>) repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> findById(@PathVariable Long id){
        return repository.findById(id);
    }
}
