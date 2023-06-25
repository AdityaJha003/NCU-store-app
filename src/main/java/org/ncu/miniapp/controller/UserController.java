package org.ncu.miniapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.ncu.miniapp.database.DataLayer;
import org.ncu.miniapp.database.DatalayerImp;
import org.ncu.miniapp.entity.Product;
import org.ncu.miniapp.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@ModelAttribute("User")
	public User getUserEntity() {
		return new User();
	}
	
	@ModelAttribute("Product")
	public Product getProductEntity() {
		return new Product();
	}
	
	@RequestMapping(value="/sign-up")
	public String signupForm() {
		return "signupForm";
	}
	
	@RequestMapping(value="/signup-process")
	public String insertProcess(@Valid @ModelAttribute("User") User u,BindingResult bindingResult,Model model) {
		DataLayer dl=new DatalayerImp(u);
		dl.insert();
		return "home";
	}
	
	@RequestMapping(value="/login")
	public String loginProcess(@ModelAttribute("User") User u,BindingResult bindingResult,Model model) {
		DataLayer dl=new DatalayerImp(u);
		String type= dl.typecheck();
		System.out.println(type);
		if(type.equals("Seller"))
			return "seller-page";
		else if(type.equals("Buyer")) {
			List<Product> list= dl.showProducts();
			List<String> options=new ArrayList<String>();
			for(Product test:list) {
//				String product="Seller Name:"+test.getSname()+"\tProduct Category:"+test.getCategory()+"\tProduct name:"+
//			test.getPname()+"\tQuantity:"+test.getQuantity()+"\tProduct Description:"+test.getPDesc()+"\tProductPrice:"+
//			test.getPrice();
				options.add(test.getPname());
			}
//			<td>${a.sname}</td>
//			<td>${a.category}</td>
//			<td>${a.pname}</td>
//			<td>${a.quantity}</td>
//			<td>${a.PDesc}</td>
//			<td>${a.price}</td>
			model.addAttribute("plist",list);
			model.addAttribute("viewlist",options);
			return "buyer-page";
		}
		return "home";
	}
	
	
}
