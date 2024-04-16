package com.hotsix.infra.codegroup;

import java.util.List;

public interface CodeGroupDao {
	
	public List<CodeGroupDto> selelctList(CodeGroupVo vo);
	
	public CodeGroupDto selectOne(CodeGroupDto dto);
}
