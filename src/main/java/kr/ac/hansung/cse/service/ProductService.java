package kr.ac.hansung.cse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.cse.dao.ProductDao;
import kr.ac.hansung.cse.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public List<String> getProducts() {
		
		List<Product> products = productDao.getProducts();
		List<String> tokens = new ArrayList<>();
		for (Product product : products) {
			tokens.add(product.getToken());
		}
		
		return tokens;
	}
	
	public void insert(Product product) {
		productDao.insert(product);
	}
}
 