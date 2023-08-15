package com.victorsaccucci.Senacdw20232VictorSaccucciBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import com.victorsaccucci.Senacdw20232VictorSaccucciBackend.controller.Products;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @GetMapping
    public ArrayList<Products> listAllProducts(){
        Products p1 = new Products("teste", "teste", 10, 1, LocalDate.now());
        Products p2 = new Products("Produto 2", "Fabricante 2", 20, 2, LocalDate.now());
        Products p3 = new Products("Produto 3", "Fabricante 3", 30, 3, LocalDate.now());

        ArrayList<Products> list = new ArrayList<Products>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        return list;
    }
}
