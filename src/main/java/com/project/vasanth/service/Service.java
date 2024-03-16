package com.project.vasanth.service;

import java.util.List;


import com.project.vasanth.entity.Products;

public interface Service {

	
	Products saveProduct(Products product );
	
    List<Products> getAllproducts();
	
	Products getProductById(Integer id);
	
	Products updateProduct(Products product);
	
	void deleteProductById(Integer id);
}
