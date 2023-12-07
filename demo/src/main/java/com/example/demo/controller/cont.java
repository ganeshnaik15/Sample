package com.example.demo.controller;

import com.swagger.client.codegen.rest.api.ProductControllerApi;
import com.swagger.client.codegen.rest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hi")
public class cont {

    @Autowired
    private ProductControllerApi productControllerApi;

    @GetMapping("/test")
    public String index() {
        return"welcome to spring boot rest web services";
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id) {
        return productControllerApi.getProductByIdUsingGET(id);
    }

    @GetMapping("/all")
    public List<Product> getProducts(){
        return productControllerApi.getAllProductsUsingGET();
    }
}
