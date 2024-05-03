package com.hotsix.infra.exits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotsix.common.constants.Constants;
import com.hotsix.common.util.UtilDateTime;
import com.hotsix.infra.member.MemberService;
import com.hotsix.infra.member.MemberVo;
import com.hotsix.infra.product.ProductService;
import com.hotsix.infra.product.ProductVo;

@Controller
public class ExitsController {

	@Autowired
	ExitsService service;
	
	@Autowired
	ProductService pservice;
	
	@Autowired
	MemberService mservice;
	
	public void setSearch(ExitsVo vo) throws Exception {
		/* 최초 화면 로딩시에 세팅은 문제가 없지만 */
		/*이후 전체적으로 데이터를 조회를 하려면 null 값이 넘어 오는 관계로 문제가 전체 데이터 조회가 되지 못한다.*/
		/*해서 BaseVo.java 에서 기본값을 주어서 처리*/
//		vo.setShUseNy(vo.getShUseNy() == null ? 1 : vo.getShUseNy());
//		vo.setShDelNy(vo.getShDelNy() == null ? 0 : vo.getShDelNy());
//		vo.setShOptionDate(vo.getShOptionDate() == null ? 2 : vo.getShOptionDate());
		
		/* 초기값 세팅이 있는 경우 사용 */
		vo.setShDateStart(vo.getShDateStart() == null
		    ? UtilDateTime.calculateDayReplace00TimeString(UtilDateTime.nowLocalDateTime(), Constants.DATE_INTERVAL)
		    : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null
		    ? UtilDateTime.nowString()
		    : UtilDateTime.add59TimeString(vo.getShDateEnd()));		
		
//		/* 초기값 세팅이 없는 경우 사용 */
//		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
//		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		
		
	}
	
	
	
	@RequestMapping(value = "/exitsXdmList")
	public String exitsXdmList(@ModelAttribute("vo") ExitsVo vo,ExitsDto dto, Model model) throws Exception {
		
		setSearch(vo);
		
		model.addAttribute("list", service.selectList(vo));
		
		
//		if (vo.getTotalRows() > 0) {
//			model.addAttribute("list", service.selectList(vo));
//		}
		
		return "adm/infra/exits/exitsXdmList";
	}
	
	@RequestMapping(value = "/exitsXdmAdd")
	public String exitsXdmAdd(@ModelAttribute("vo") MemberVo mvo,ProductVo pvo,Model model) throws Exception {
		
		model.addAttribute("plist", pservice.productList(pvo));
		
		model.addAttribute("mlist", mservice.memberList(mvo));
		
		return "adm/infra/exits/exitsXdmAdd";
	}
	
	@RequestMapping(value = "/exitsInsert")
	public String exitsInsert(ExitsDto dto) throws Exception {
		
		service.insert(dto);
		
		return "redirect:/exitsXdmList";
	}
	
	@RequestMapping(value = "/exitsUpdate")
	public String exitsUpdate(ExitsDto dto) throws Exception {
		
		service.update(dto);
		
		return "redirect:/exitsXdmList";
	}
	
	@RequestMapping(value = "/exitsForm")
	public String exitsForm(ExitsDto dto,Model model) throws Exception {
		
		model.addAttribute("item", service.selectOne(dto));
		
		return "adm/infra/exits/exitsForm";
	}
	
	@RequestMapping(value = "/exitsUelete")
	public String exitsUelete(ExitsDto dto) throws Exception {
		
		service.uelete(dto);
		
		return "redirect:/exitsXdmList";
	}
	
	@RequestMapping(value = "/exitsDelete")
	public String exitsDelete(ExitsDto dto) throws Exception {
		
		service.delete(dto);
		
		return "redirect:/exitsXdmList";
	}
	
}
