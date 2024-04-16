package com.hotsix.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CodeGroupController {

	@Autowired
	CodeGroupService service;
	
	@RequestMapping(value = "/codeGroupAdmList")
	public String codeGroupAdmList(@ModelAttribute("vo") CodeGroupVo vo,Model model)throws Exception{
		 
		model.addAttribute("list", service.selelctList(vo));
		
		return "";
	}
	
	@RequestMapping(value = "/")
	public String codeGroupAdmView(CodeGroupDto dto, Model model) throws Exception{
		model.addAttribute("item", service.selectOne(dto));
	
		return ""; //
		
	}
}
