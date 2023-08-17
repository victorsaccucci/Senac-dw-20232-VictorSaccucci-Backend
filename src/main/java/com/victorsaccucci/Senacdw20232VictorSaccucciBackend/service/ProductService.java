package com.victorsaccucci.Senacdw20232VictorSaccucciBackend.service;

import com.victorsaccucci.Senacdw20232VictorSaccucciBackend.entity.Product;
import com.victorsaccucci.Senacdw20232VictorSaccucciBackend.reporsitory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {

   @Autowired
   private ProductRepository repository;

    @Transactional
    public ArrayList<Product> listAllProducts(){
    return (ArrayList<Product>) repository.findAll();
    }

    public Optional<Product> findById(Long id){
     return repository.findById(id);
    }

}
