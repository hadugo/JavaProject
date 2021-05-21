package com.kgs.spring.service.Impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kgs.spring.dao.EmployDAO;
import com.kgs.spring.dao.Impl.EmployDAOImpl;
import com.kgs.spring.dto.EmployDTO;
import com.kgs.spring.service.EmployService;

@Service
public class EmployServiceImpl implements EmployService {

	@Inject
	EmployDAO employDAO;
	
	@Override
	public Integer getEmployCnt() throws Exception {
		return employDAO.getEmployCnt();
	}

	@Override
	public List<EmployDTO> getEmployList( ) throws Exception {
		return employDAO.getEmployList();
	}

	@Override
	public EmployDTO getEmploy( String employCode) throws Exception {
		return employDAO.getEmploy(employCode);
	}

	@Override
	public int insertEmploy( EmployDTO employDTO) throws Exception {
		return employDAO.insertEmploy(employDTO);
	}

	@Override
	public int insertEmploy( List<EmployDTO> list) throws Exception {
		return employDAO.insertEmploy(list);
	}

	@Override
	public int updateEmploy( EmployDTO employDTO) throws Exception {
		return employDAO.updateEmploy(employDTO);
	}

	@Override
	public int deleteEmploy( String employCode) throws Exception {
		return employDAO.deleteEmploy(employCode);
	}

	@Override
	public int deleteEmploy() throws Exception {
		return employDAO.deleteEmploy();
	}

	@Override
	public void insertEmploy() throws Exception {
		employDAO.insertEmploy();
	}

}
