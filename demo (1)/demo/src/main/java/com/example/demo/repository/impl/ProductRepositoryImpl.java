package com.example.demo.repository.impl;

import com.example.demo.repository.model.ProductDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl extends BaseRepositoryImpl{

    public List<ProductDTO> getProducts(){
        StringBuilder sql=new StringBuilder();
        Map<String, Object> mapParams=new HashMap<>();
        sql.append("""
                SELECT t.id as product_id,
                	t.name as product_name,
                	t.price as product_price
                 FROM product t
                """);
        List<ProductDTO> listData = getListData(sql.toString(), mapParams, ProductDTO.class);
        return listData;
    }

}
