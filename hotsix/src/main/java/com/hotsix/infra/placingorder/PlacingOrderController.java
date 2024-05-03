package com.hotsix.infra.placingorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotsix.infra.codegroup.CodeGroupService;
import com.hotsix.infra.member.MemberDto;
import com.hotsix.infra.member.MemberService;
import com.hotsix.infra.member.MemberVo;
import com.hotsix.infra.order.OrderDto;
import com.hotsix.infra.order.OrderService;
import com.hotsix.infra.product.ProductDto;
import com.hotsix.infra.product.ProductService;
import com.hotsix.infra.product.ProductVo;



@Controller
public class PlacingOrderController {
	@Autowired
	PlacingOrderService service;
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/placingOrderXdmList")
	public String placingOrderXdmList(@ModelAttribute("vo") PlacingOrderVo vo,PlacingOrderDto dto, Model model) throws Exception {
		
		model.addAttribute("list", service.selectList(vo));
		
		return "adm/infra/placingorder/placingOrderXdmList";
	}
	
	@RequestMapping(value = "/placingOrderForm")
	public String placingOrderFrom(PlacingOrderDto dto, Model model) throws Exception {
		
		
		
		model.addAttribute("item", service.selectOne(dto));
		
		return "adm/infra/placingorder/placingOrderForm";
	}
	
	@RequestMapping(value = "/placingOrderAdd")
	public String placingOrderAdd(PlacingOrderDto dto,MemberVo mvo,ProductVo pvo,  Model model) throws Exception {
		
		model.addAttribute("list", memberService.memberList(mvo));
		model.addAttribute("plist", productService.productList(pvo));
		
		return "adm/infra/placingorder/placingOrderAdd";
	}
	
	@RequestMapping(value="/placingInsert")
	public String placingInsert(PlacingOrderDto dto) throws Exception {
		
		service.insert(dto);
	
		return "redirect:/placingOrderXdmList";
	}
	
	@RequestMapping(value="/placingUpdate")
	public String placingUpdate(PlacingOrderDto dto) throws Exception {
		
		service.update(dto);
	
		return "redirect:/placingOrderXdmList";
	}
	
	@RequestMapping(value="/placingDelete")
	public String placingDelete(PlacingOrderDto dto) throws Exception {
		
		service.delete(dto);
	
		return "redirect:/placingOrderXdmList";
	}
	
	@RequestMapping(value="/placingUelete")
	public String placingUelete(PlacingOrderDto dto) throws Exception {
		
		service.uelete(dto);
	
		return "redirect:/placingOrderXdmList";
	}
	
}
