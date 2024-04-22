package com.hotsix.infra.arrival;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotsix.infra.member.MemberDto;
import com.hotsix.infra.member.MemberService;
import com.hotsix.infra.member.MemberVo;
import com.hotsix.infra.product.ProductService;
import com.hotsix.infra.product.ProductVo;

@Controller
public class ArrivalController {
	@Autowired
	ArrivalService service;
	@Autowired
	MemberService memberService;
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="arrivalXdmList")
	public String arrivalXdmList(@ModelAttribute("vo") ArrivalVo vo,Model model) throws Exception{
		
		model.addAttribute("list", service.selectList(vo));
		
		return "/adm/infra/arrival/arrivalXdmList";
	}
	
	@RequestMapping(value="arrivalForm")
	public String arrivalForm(ArrivalDto dto,Model model)throws Exception{
		
		model.addAttribute("item", service.selectOne(dto));
		
		return "/adm/infra/arrival/arrivalForm";
	}
	
	@RequestMapping(value="arrivalAdd")
	public String arrivalAdd(ArrivalDto dto,MemberVo mvo,ProductVo pvo, Model model)throws Exception{
		
		model.addAttribute("list", memberService.selectList(mvo));
		model.addAttribute("plist", productService.selectList(pvo));
		
		model.addAttribute("item", service.selectOne(dto));
		
		return "/adm/infra/arrival/arrivalAdd";
	}
	
}
