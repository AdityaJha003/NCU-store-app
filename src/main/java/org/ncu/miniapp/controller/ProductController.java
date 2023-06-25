package org.ncu.miniapp.controller;


import java.util.List;

import javax.validation.Valid;

import org.ncu.miniapp.database.DataLayer;
import org.ncu.miniapp.database.DatalayerImp;
import org.ncu.miniapp.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@ModelAttribute("Product")
	public Product getProductEntity() {
		return new Product();
	}
	
	@RequestMapping(value="/seller-process")
	public String insertProcess(@Valid @ModelAttribute("Product") Product p,BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "seller-page";
		}else {
			DataLayer dl=new DatalayerImp(p);
			dl.addProduct();
			return "seller-finish";
		}
		
	}
	
	@RequestMapping(value="/buyer-process")
	public String buyerProcess( @ModelAttribute("Product") Product p,BindingResult bindingResult,Model model) {
		
		DataLayer dl=new DatalayerImp(p);
		List<Product> bp=dl.boughtProducts(p.getBuylist());
		model.addAttribute("printlist",bp);
		return "buyer-display";
	}
}
