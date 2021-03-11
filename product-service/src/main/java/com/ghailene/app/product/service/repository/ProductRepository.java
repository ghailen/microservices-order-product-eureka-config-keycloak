package com.ghailene.app.product.service.repository;

import com.ghailene.app.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
