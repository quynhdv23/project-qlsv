package com.example.demo.controller;

import com.example.demo.entity.Categories;
import com.example.demo.entity.Client;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoriesRepository;
import com.example.demo.repository.ProductRepository;
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
    private final CategoriesRepository categoriesRepository;
//    private final ClientRepository clientRepository;

//    private final UserAdminRepository userAdminRepository;


    private final ProductRepository prRepo;

    @GetMapping("/test")
    public List<ProductDTO> list() {
        List<ProductDTO> products = productRepository.getProducts();
        return products;
    }

    @GetMapping("/test2")
    public List<Product> listData() {
        List<Product> products = prRepo.findAll();
        return products;
    }

    @GetMapping("/test3")
    public List<Categories> listData3() {
        List<Categories> products = categoriesRepository.findAll();
        return products;
    }

//    @GetMapping("/test33")
//    public List<UserAdmin> listData33() {
//        List<UserAdmin> products = (List<UserAdmin>) userAdminRepository.findAll();
//        return products;
//    }


    
}
