/**
 * 
 */
package com.simplecoding.simpleservice.dept.service;


import com.simplecoding.simpleservice.common.Criteria;
import com.simplecoding.simpleservice.dept.vo.DeptVO;
import com.simplecoding.simpleservice.testdata.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	
	public List<?> selectDeptList(Criteria criteria) {
		return deptMapper.selectDeptList(criteria);
	}
	
	
	public void insert(DeptVO deptVO) {
		deptMapper.insert(deptVO);
	}
	
	
	public DeptVO selectDept(long dno) {
		return deptMapper.selectDept(dno);
	}
	
	
	public void update(DeptVO deptVO) {
		deptMapper.update(deptVO);	
	}
	
	
	public void delete(long dno) {
		deptMapper.delete(dno);
	}
}




