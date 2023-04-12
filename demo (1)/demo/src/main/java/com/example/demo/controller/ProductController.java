package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.impl.ProductRepositoryImpl;
import com.example.demo.repository.model.ProductDTO;
import com.example.demo.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private ProductServiceImpl service;
    private final ProductRepositoryImpl productRepository;

    @GetMapping("/test")
    public List<ProductDTO> list() {
        List<ProductDTO> products = productRepository.getProducts();
        return products;
    }
    
}
