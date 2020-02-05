/*
 * @UserController.java	@Jan 22, 2020  
 */
package com.ec2.rds.api.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ec2.rds.api.vo.ApiResponse;
import com.ec2.rds.api.vo.Product;

/**
 * <p>
 * </p>
 *
 * @author Bhabani.behera
 * @version 1.0
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class PrductController {

	private static final Logger logger = LoggerFactory.getLogger(PrductController.class);
	private static List<Product> products = new LinkedList<>();


	@PostMapping(value = "/products")
	public HttpEntity<Object> addProducts(@RequestBody Product product){
		product.setId(UUID.randomUUID().toString());
		logger.info("Product : {}", product);
		products.add(product);
		return new ResponseEntity<>(new ApiResponse("Product added successfully."),HttpStatus.OK);
	}

	@GetMapping(value = "/getproducts")
	public HttpEntity<Object> getProducts(){
		return new ResponseEntity<>(new ApiResponse(products),HttpStatus.OK);
	}

	@GetMapping(value = "/getproduct")
	public HttpEntity<Object> getProduct(@RequestParam String id){
		return new ResponseEntity<>(new ApiResponse(products.stream().filter(p -> p.getId().equals(id)).map(p->p).findAny().orElse(null)),HttpStatus.OK);
	}

	@PutMapping(value = "/updateproduct")
	public HttpEntity<Object> updateProducts(@RequestBody Product newProduct,@RequestParam String id){
		logger.info("Updated Product : {}", newProduct);
		products.stream().map(p->{
			if(p.getId().equals(id)) {
				p.setId(id);
				p.setProductName(newProduct.getProductName());
				p.setProductDescription(newProduct.getProductDescription());
				p.setProductPrice(newProduct.getProductPrice());
			}
			return p;
		}).collect(Collectors.toList());
		return new ResponseEntity<>(new ApiResponse("Product updated successfully."),HttpStatus.OK);
	}

	@DeleteMapping("/deleteproduct")
	public HttpEntity<Object> deleteProduct(@RequestParam String id){
		Product product = products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
		if(Objects.nonNull(product)) {
			products.remove(product);
			return new ResponseEntity<>(new ApiResponse("Product deleted successfully."),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(new ApiResponse("Product deletion failed."),HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}

}
