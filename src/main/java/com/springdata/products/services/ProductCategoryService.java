package com.springdata.products.services;

import java.util.List;

import com.springdata.products.models.ProductCategory;




public interface ProductCategoryService {


 public List<ProductCategory> getAll();
  
  public ProductCategory save(ProductCategory p);
  
  public ProductCategory findById(Long productCategoryId);
  
  public ProductCategory update(Long productCategoryId, ProductCategory productCategory);

  public String delete(Long productCategoryId);


}