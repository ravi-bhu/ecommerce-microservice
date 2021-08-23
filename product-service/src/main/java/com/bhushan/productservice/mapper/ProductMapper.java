package com.bhushan.productservice.mapper;

import com.bhushan.productservice.dto.ProductCreateRequest;
import com.bhushan.productservice.model.Product;

public class ProductMapper {
    private ProductMapper() {
    }

    public static Product toProduct(ProductCreateRequest productCreateRequest) {
        return Product.builder()
                .name(productCreateRequest.getName())
                .description(productCreateRequest.getDescription())
                .price(productCreateRequest.getPrice())
                .build();
    }
}
