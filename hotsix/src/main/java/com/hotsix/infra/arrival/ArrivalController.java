package com.hotsix.infra.arrival;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArrivalController {
	@Autowired
	ArrivalService service;
	
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
}
