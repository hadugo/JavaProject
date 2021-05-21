package com.kgs.spring.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kgs.spring.dao.EmployDAO;
import com.kgs.spring.dto.EmployDTO;

@Repository
public class EmployDAOImpl implements EmployDAO {
	
	@Inject
	SqlSession sqlSession;

	@Override
	public Integer getEmployCnt() throws Exception {
		return (Integer) sqlSession.selectOne("getEmployCnt");
	}

	@Override
	public List<EmployDTO> getEmployList() throws Exception {
		return sqlSession.selectList("getEmployList");
	}

	@Override
	public EmployDTO getEmploy(String employCode) throws Exception {
		return (EmployDTO) sqlSession.selectOne("getEmploy", employCode);
	}

	@Override
	public int insertEmploy(EmployDTO employDTO) throws Exception {
		return sqlSession.insert("insertEmploy", employDTO);
	}

	@Override
	public int insertEmploy(List<EmployDTO> list) throws Exception  {
		return sqlSession.insert("insertEmployList", list);
	}

	@Override
	public int updateEmploy(EmployDTO employDTO) throws Exception {
		return sqlSession.update("updateEmploy", employDTO);
	}

	@Override
	public int deleteEmploy(String employCode) throws Exception {
		return sqlSession.delete("deleteEmploy", employCode);
	}

	@Override
	public int deleteEmploy() throws Exception {
		return sqlSession.delete("deleteAllEmploy");
	}

	@Override
	@Transactional
	public void insertEmploy() throws Exception {
		sqlSession.delete("deleteAllEmploy");
		sqlSession.insert("insertEmploy", new EmployDTO("00001", "aaaaaaaaa"));
		sqlSession.insert("insertEmploy", new EmployDTO("00002", "bbbbbbbbb"));
		sqlSession.insert("insertEmploy", new EmployDTO("00001", "ccccccccc"));
	}

}
