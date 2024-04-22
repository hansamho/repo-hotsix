package com.hotsix.infra.arrival;

import java.util.List;

public interface ArrivalDao {
	
	public List<ArrivalDto> selectList(ArrivalVo vo);
	
	public ArrivalDto selectOne(ArrivalDto dto);
	
	public int insert(ArrivalDto dto);
}
