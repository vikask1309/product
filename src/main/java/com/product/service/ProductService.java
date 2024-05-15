package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.ProductEO;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductEO saveProductInformation(ProductEO productEO) {
		return productRepository.save(productEO);
	}
	
	public List<ProductEO> saveProductInformationList(List<ProductEO> productEO) {
		return productRepository.saveAll(productEO);
	}
	
	public List<ProductEO> getProducts() {
		return productRepository.findAll();
	}
	
	public ProductEO getProductById(int id) {
		return productRepository.findById(id);
	}
	
	public ProductEO getProductByName(String name, String companyName) {
		return productRepository.findByProductNameAndCompanyName(name, companyName);
	}
	
	public List<ProductEO> getProductByIdCustom(String name) {
		return productRepository.findProduct(name);
	}
	
	public List<ProductEO> getProductByIdNative(String name, String cost) {
		return productRepository.findProductNative(name, cost);
	}

}
