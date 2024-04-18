package com.hotsix.infra.placingorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacingOrderService {
	@Autowired
	PlacingOrderDao dao;
	
	public List<PlacingOrderDto> selectList(PlacingOrderVo vo){
		return dao.selectList(vo);
	}
	
	public PlacingOrderDto selectOne(PlacingOrderDto dto) {
		return dao.selectOne(dto);
	}
	
	public int insert(PlacingOrderDto dto) {
		return dao.insert(dto);
	}
	
	public int delete(PlacingOrderDto dto) {
		return dao.delete(dto);
	}
	
	public int uelete(PlacingOrderDto dto) {
		return dao.uelete(dto);
	}

	
}
