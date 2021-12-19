package com.usa.retos.retosciclo4.Repository.crudRepository;

import com.usa.retos.retosciclo4.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {

}

