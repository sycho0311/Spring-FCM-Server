package kr.ac.hansung.cse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.cse.model.Product;
import kr.ac.hansung.cse.service.ProductService;

@Controller
public class RegisterController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private Product product;

	@RequestMapping(value = "/RegisterKey", method = RequestMethod.POST)
	public String showDetail(@RequestParam("Token") String token, Model model) {
		
		if (token != null) {
			
			// Product product = new Product();
			
			product.setToken(token);
			
			productService.insert(product);
		}
		
		return "RegisterKey";
	}
}
