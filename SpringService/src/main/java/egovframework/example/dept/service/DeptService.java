/**
 * 
 */
package egovframework.example.dept.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface DeptService {
	List<?> selectDeptList(Criteria criteria);
	void insert(DeptVO deptVO);
	DeptVO selectDept(long dno);
	void update(DeptVO deptVO);
	void delete(long dno);
}
