package com.hotsix.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao dao;
	
	public List<CodeGroupDto> selelctList(CodeGroupVo vo){
		return dao.selelctList(vo);
	}
	
	public CodeGroupDto selectOne(CodeGroupDto dto) {
		return dao.selectOne(dto);
	}
}
