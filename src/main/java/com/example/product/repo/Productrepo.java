package com.example.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product.mode.ProductModel;

@Repository
public interface Productrepo extends JpaRepository<ProductModel, Integer>{

}
