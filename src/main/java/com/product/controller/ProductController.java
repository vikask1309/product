package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductEO;
import com.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public ProductEO saveProduct(@RequestBody ProductEO productEO) {
		return productService.saveProductInformation(productEO);
	}
	
	@PostMapping("/addProductList")
	public List<ProductEO> saveProductList(@RequestBody List<ProductEO> productEO) {
		return productService.saveProductInformationList(productEO);
	}
	
	@GetMapping("/getProduct")
	public List<ProductEO> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public ProductEO getProductById(@PathVariable int id){
		return productService.getProductById(id);
	}
	
	@GetMapping("/getProductByName/{name}/{company}")
	public ProductEO getProductByName(@PathVariable String name, @PathVariable String company){
		return productService.getProductByName(name, company);
	}
	
	@GetMapping("/getProductByIdCustom/{name}")
	public List<ProductEO> getProductByIdCustom(@PathVariable String name){
		return productService.getProductByIdCustom(name);
	}
	
	@GetMapping("/getProductByIdNative/{name}/{cost}")
	public List<ProductEO> getProductByIdNative(@PathVariable String name, @PathVariable String cost){
		return productService.getProductByIdNative(name, cost);
	}

}
