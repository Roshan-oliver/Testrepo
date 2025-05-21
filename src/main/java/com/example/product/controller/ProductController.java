package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.json.ProductJson;
import com.example.product.mode.ProductModel;
import com.example.product.repo.Productrepo;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private Productrepo repo;
	
	@PostMapping("addthedATA")
	public ProductModel add(@RequestBody ProductJson json) {
		ProductModel model = new ProductModel();
		model.setPname(json.getPname());
		model.setPrice(json.getPrice());
		repo.save(model);
		return model;
		
	}

}
