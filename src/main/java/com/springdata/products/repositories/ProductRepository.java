package com.springdata.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springdata.products.models.Product;



public interface ProductRepository extends CrudRepository<Product, Long> {

}