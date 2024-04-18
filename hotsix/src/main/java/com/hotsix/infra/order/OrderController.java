package com.hotsix.infra.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

	@Autowired
	OrderService service;
	
	@RequestMapping(value = "/orderXdmList")
	public String orderXdmList(@ModelAttribute("vo") OrderVo vo, Model model) throws Exception {
		
		model.addAttribute("list", service.selectList(vo));
		
		return "adm/infra/order/orderList";
	}
	
	@RequestMapping(value = "/orderAdd")
	public String orderAdd() throws Exception {
		
		return "adm/infra/order/orderAdd";
	}
}
