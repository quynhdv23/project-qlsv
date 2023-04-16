package com.example.demo.controller;

import com.example.demo.entity.UserAdmin;
import com.example.demo.repository.UserAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserAdminController {
    private final UserAdminRepository userAdminRepository;

    @GetMapping("/test5")
    public List<UserAdmin> listData33() {
        List<UserAdmin> products = userAdminRepository.findAll();
        return products;
    }
}
