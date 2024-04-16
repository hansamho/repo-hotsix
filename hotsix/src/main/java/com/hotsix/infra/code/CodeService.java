package com.hotsix.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {
	
	@Autowired
	CodeDao dao;
	
	public List<CodeDto> selectList(CodeVo vo){
		return dao.selectList(vo);
	}
	
	public CodeDto selectOne(CodeDto dto) {
		return dao.selectOne(dto);
	}
}
