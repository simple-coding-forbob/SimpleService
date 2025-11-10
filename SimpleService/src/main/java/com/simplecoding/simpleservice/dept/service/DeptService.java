/**
 * 
 */
package com.simplecoding.simpleservice.dept.service;


import com.simplecoding.simpleservice.common.Criteria;
import com.simplecoding.simpleservice.dept.vo.Dept;
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
	
	
	public void insert(Dept dept) {
		deptMapper.insert(dept);
	}
	
	
	public Dept selectDept(long dno) {
		return deptMapper.selectDept(dno);
	}
	
	
	public void update(Dept dept) {
		deptMapper.update(dept);	
	}
	
	
	public void delete(long dno) {
		deptMapper.delete(dno);
	}
}




