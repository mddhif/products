package com.springdata.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springdata.products.models.ProductCategory;



public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {

}