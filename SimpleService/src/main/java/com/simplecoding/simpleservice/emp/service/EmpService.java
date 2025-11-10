/**
 * 
 */
package com.simplecoding.simpleservice.emp.service;


import com.simplecoding.simpleservice.common.Criteria;
import com.simplecoding.simpleservice.emp.vo.Emp;
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
	
	
	public void insert(Emp emp) {
		empMapper.insert(emp);
	}
	
	
	public Emp selectEmp(long eno) {
		return empMapper.selectEmp(eno);
	}
	
	
	public void update(Emp emp) {
		empMapper.update(emp);
	}
	
	
	public void delete(long eno) {
		empMapper.delete(eno);
		
	}
}






