package com.hotsix.infra.code;

import java.util.List;

public interface CodeDao {
	public List<CodeDto> selectList(CodeVo vo);
	
	public CodeDto selectOne(CodeDto dto);
}
