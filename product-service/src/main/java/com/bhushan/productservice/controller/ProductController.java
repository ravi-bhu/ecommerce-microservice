package com.bhushan.productservice.controller;

import com.bhushan.productservice.dto.ProductCreateRequest;
import com.bhushan.productservice.model.Product;
import com.bhushan.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProducts() {
        return this.productService.getAllProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody final ProductCreateRequest productCreateRequest) {
        this.productService.addProduct(productCreateRequest);
    }

}
