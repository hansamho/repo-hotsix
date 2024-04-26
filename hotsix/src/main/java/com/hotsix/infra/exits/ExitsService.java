package com.hotsix.infra.exits;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExitsService {
	
	@Autowired
	ExitsDao dao;
	
	public List<ExitsDto> selectList(ExitsVo vo){
		
		return dao.selectList(vo);
	}
	
	public int insert(ExitsDto dto) {
		
		return dao.insert(dto);
	}

}
