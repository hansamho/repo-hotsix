package com.hotsix.infra.arrival;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArrivalService {
	@Autowired
	ArrivalDao dao;
	
	public List<ArrivalDto> selectList(ArrivalVo vo){
		return dao.selectList(vo);
	}
	
	public ArrivalDto selectOne(ArrivalDto dto) {
		return dao.selectOne(dto);
	}
}
