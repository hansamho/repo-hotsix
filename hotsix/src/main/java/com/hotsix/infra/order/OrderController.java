package com.hotsix.infra.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotsix.infra.member.MemberService;
import com.hotsix.infra.member.MemberVo;
import com.hotsix.infra.product.ProductService;
import com.hotsix.infra.product.ProductVo;

@Controller
public class OrderController {

	@Autowired
	OrderService service;
	
	@Autowired
	MemberService mservice;
	
	@Autowired
	ProductService pservice;
	
	@RequestMapping(value = "/orderXdmList")
	public String orderXdmList(@ModelAttribute("vo") OrderVo vo, Model model) throws Exception {
		
		model.addAttribute("list", service.selectList(vo));
		
		return "adm/infra/order/orderList";
	}
	
	@RequestMapping(value = "/orderAdd")
	public String orderAdd(@ModelAttribute("vo") MemberVo mvo,ProductVo pvo, Model model) throws Exception {
		
		model.addAttribute("list", mservice.selectList(mvo));
		model.addAttribute("plist", pservice.selectList(pvo));
		
		return "adm/infra/order/orderAdd";
	}
	
	@RequestMapping(value = "/orderInsert")
	public String orderInsert(OrderDto dto) throws Exception{
		
		service.insert(dto);
		return "redirect:/orderXdmList";
	}
}
