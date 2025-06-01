package egovframework.example.emp.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface EmpService {
	public List<?> selectEmpList(Criteria criteria);
	void insert(EmpVO empVO);
	EmpVO selectMember(long eno);
	void update(EmpVO empVO); 
	void delete(long eno);          
}
