package com.hotsix.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotsix.infra.codegroup.CodeGroupVo;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	
	@RequestMapping(value = "/codeAdmList")
	public String codeAdmList(@ModelAttribute("vo") CodeVo vo,Model model)throws Exception{
		 
		model.addAttribute("list", service.selectList(vo));
		
		return "";
	}
	
}
