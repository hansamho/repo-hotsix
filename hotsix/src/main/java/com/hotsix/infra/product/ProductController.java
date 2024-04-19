package com.hotsix.infra.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping(value = "/productXdmList")
	public String productXdmList(@ModelAttribute("vo") ProductVo vo, Model model) throws Exception {
		
		model.addAttribute("list", service.selectList(vo));
		
		return "adm/infra/product/productXdmList";
	}
	
//	@RequestMapping(value = "/orderAdd")
//	public String orderAdd(@ModelAttribute("vo") MemberVo mvo, Model model) throws Exception {
//		
//		model.addAttribute("list", mservice.selectList(mvo));
//		
//		return "adm/infra/order/orderAdd";
//	}
}
