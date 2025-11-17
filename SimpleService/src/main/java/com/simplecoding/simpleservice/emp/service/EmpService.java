/**
 * 
 */
package com.simplecoding.simpleservice.emp.service;


import com.simplecoding.simpleservice.common.Criteria;

import com.simplecoding.simpleservice.emp.vo.EmpVO;
import com.simplecoding.simpleservice.testdata.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
	@Autowired
	private EmpMapper empMapper;

	
	public List<?> selectEmpList(Criteria criteria) {
		return empMapper.selectEmpList(criteria);
	}
	
	
	public void insert(EmpVO empVO) {
		empMapper.insert(empVO);
	}
	
	
	public EmpVO selectEmp(long eno) {
		return empMapper.selectEmp(eno);
	}
	
	
	public void update(EmpVO empVO) {
		empMapper.update(empVO);
	}
	
	
	public void delete(long eno) {
		empMapper.delete(eno);
		
	}
}






