package com.hotsix.infra.arrival;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotsix.infra.company.CompanyService;
import com.hotsix.infra.company.CompanyVo;
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
	@Autowired
	CompanyService companyService;
	
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
	public String arrivalAdd(ArrivalVo vo,ArrivalDto dto,CompanyVo cvo,MemberVo mvo, ProductVo pvo, Model model)throws Exception{
		
		model.addAttribute("list", companyService.selectList(cvo));
		model.addAttribute("mlist", memberService.memberList(mvo));
		model.addAttribute("plist", productService.productList(pvo));
		
		
		return "/adm/infra/arrival/arrivalAdd";
	}
	
	@RequestMapping(value="/arrivalInsert")
	public String arrivalInsert(ArrivalDto dto) throws Exception {
		
		service.insert(dto);
	
		return "redirect:/arrivalXdmList";
	}
	
	@RequestMapping(value="/arrivalUpdate")
	public String arrivalUpdate(ArrivalDto dto) throws Exception {
		
		service.update(dto);
	
		return "redirect:/arrivalXdmList";
	}
	@RequestMapping(value="/arrivalUelete")
	public String arrivalUelete(ArrivalDto dto) throws Exception {
		
		service.update(dto);
	
		return "redirect:/arrivalXdmList";
	}
	@RequestMapping(value="/arrivalDelete")
	public String arrivalDelete(ArrivalDto dto) throws Exception {
		
		service.delete(dto);
	
		return "redirect:/arrivalXdmList";
	}
}
