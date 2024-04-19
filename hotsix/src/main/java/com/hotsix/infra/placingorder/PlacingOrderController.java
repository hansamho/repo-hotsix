package com.hotsix.infra.placingorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotsix.infra.codegroup.CodeGroupService;



@Controller
public class PlacingOrderController {
	@Autowired
	PlacingOrderService service;
	
	@Autowired
	CodeGroupService codeGroupService;
	
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
	public String placingOrderAdd(PlacingOrderDto dto, Model model) throws Exception {
		
		
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
