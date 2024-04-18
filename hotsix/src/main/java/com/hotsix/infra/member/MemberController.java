package com.hotsix.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo vo,MemberDto dto, Model model) throws Exception {
		
		model.addAttribute("list", service.selectList(vo));
		
		return "adm/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/memberForm")
	public String memberForm(MemberDto dto, Model model) throws Exception {
		
		model.addAttribute("item", service.selectOne(dto));
		
		return "adm/infra/member/memberForm";
	}
	
	@RequestMapping(value = "/insert")
	public String insert(MemberDto dto) {
		
		service.insert(dto);
		return "redirect:/memberXdmList";
	}
	
	@RequestMapping(value = "/update")
	public String update(MemberDto dto) {
		
		service.update(dto);
		return "redirect:/memberXdmList";
	}
	
	@RequestMapping(value = "/uelete")
	public String uelete(MemberDto dto) {
		
		service.uelete(dto);
		return "redirect:/memberXdmList";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(MemberDto dto) {
		
		service.delete(dto);
		return "redirect:/memberXdmList";
	}
	
	
}
