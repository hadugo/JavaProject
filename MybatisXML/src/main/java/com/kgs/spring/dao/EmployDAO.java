package com.kgs.spring.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kgs.spring.dto.EmployDTO;

public interface EmployDAO {
	
	public Integer getEmployCnt() throws Exception;
	public List<EmployDTO> getEmployList() throws Exception;
	public EmployDTO getEmploy(String employCode) throws Exception;
	public void insertEmploy() throws Exception;
	public int insertEmploy(EmployDTO employDTO) throws Exception;
	public int insertEmploy(List<EmployDTO> list) throws Exception;	
	public int updateEmploy(EmployDTO employDTO) throws Exception;
	public int deleteEmploy(String employCode) throws Exception;
	public int deleteEmploy() throws Exception;

}
