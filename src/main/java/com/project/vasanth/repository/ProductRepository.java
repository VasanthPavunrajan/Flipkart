package com.project.vasanth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.vasanth.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
