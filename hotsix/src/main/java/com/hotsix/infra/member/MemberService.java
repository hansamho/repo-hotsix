package com.hotsix.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;
	
	public List<MemberDto> selectList(MemberVo vo) {
			
		return dao.selectList(vo);
	}
	
	public MemberDto selectOne(MemberDto dto) {
		
		return dao.selectOne(dto);
	}
	
	public int insert(MemberDto dto) {
		
		dao.insert(dto); 
		dao.companyInsert(dto);
		return 1;
	}
	
	public int update(MemberDto dto) {
			 dao.update(dto); 
	return 1;	
	}
	
	public int uelete(MemberDto dto) {
		
		return dao.uelete(dto);
	}
	
	public int delete(MemberDto dto) {
		
		return dao.delete(dto);
	}
}
