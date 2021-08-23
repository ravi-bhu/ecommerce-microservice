package com.bhushan.productservice.service;

import com.bhushan.productservice.dto.ProductCreateRequest;
import com.bhushan.productservice.mapper.ProductMapper;
import com.bhushan.productservice.model.Product;
import com.bhushan.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    public void addProduct(final ProductCreateRequest productCreateRequest) {
        this.productRepository.save(ProductMapper.toProduct(productCreateRequest));
    }
}
