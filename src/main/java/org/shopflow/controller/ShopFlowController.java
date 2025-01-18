package org.shopflow.controller;

import org.shopflow.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.shopflow.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ShopFlowController {


        @Autowired
        private ProductService productService;

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

        @PostMapping
        public Product addProduct(@RequestBody Product product) {
            return productService.addProduct(product);
        }

        @DeleteMapping("/{id}")
        public void deleteProduct(@PathVariable Long id) {
            productService.deleteProduct(id);
        }
}


