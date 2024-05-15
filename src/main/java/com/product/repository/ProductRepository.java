package com.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.entity.ProductEO;

public interface ProductRepository extends JpaRepository<ProductEO, Integer>{
	
	ProductEO findById(int Id);
	
	ProductEO findByProductNameAndCompanyName(String productName, String companyName);
	
	@Query("select p from ProductEO p where productName like %?1%")
	List<ProductEO> findProduct(String name);
	
	@Query(value="select * from product p where product_name like %?1% and product_cost = ?2",nativeQuery = true)
	List<ProductEO> findProductNative(String name, String cost);
	

}
