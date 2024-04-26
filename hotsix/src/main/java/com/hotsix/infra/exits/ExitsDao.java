package com.hotsix.infra.exits;

import java.util.List;

public interface ExitsDao {

	public List<ExitsDto> selectList(ExitsVo vo);
	
	public int insert(ExitsDto dto);
}
