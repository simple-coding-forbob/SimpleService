/**
 * 
 */
package egovframework.example.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptService;
import egovframework.example.dept.service.DeptVO;
import egovframework.example.testdata.mapper.DeptMapper;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<?> selectDeptList(Criteria criteria) {
		return deptMapper.selectDeptList(criteria);
	}
	
	@Override
	public void insert(DeptVO deptVO) {
		deptMapper.insert(deptVO);
	}
	
	@Override
	public DeptVO selectDept(long dno) {
		return deptMapper.selectDept(dno);
	}
	
	@Override
	public void update(DeptVO deptVO) {
		deptMapper.update(deptVO);	
	}
	
	@Override
	public void delete(long dno) {
		deptMapper.delete(dno);
	}
}




