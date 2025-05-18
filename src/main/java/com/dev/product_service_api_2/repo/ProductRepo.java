package com.dev.product_service_api_2.repo;

import com.dev.product_service_api_2.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {
    // Custom query methods can be defined here if needed
    // For example, findByProductId(String productId);

}
