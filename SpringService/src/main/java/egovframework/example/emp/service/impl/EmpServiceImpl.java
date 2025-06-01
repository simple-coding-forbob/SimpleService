/**
 * 
 */
package egovframework.example.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.emp.service.EmpService;
import egovframework.example.emp.service.EmpVO;
import egovframework.example.testdata.mapper.EmpMapper;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<?> selectEmpList(Criteria criteria) {
		return empMapper.selectEmpList(criteria);
	}
	
	@Override
	public void insert(EmpVO empVO) {
		empMapper.insert(empVO);
	}
	
	@Override
	public EmpVO selectMember(long eno) {
		return empMapper.selectMember(eno);
	}
	
	@Override
	public void update(EmpVO empVO) {
		empMapper.update(empVO);
	}
	
	@Override
	public void delete(long eno) {
		empMapper.delete(eno);
		
	}
}






