/**
 * 
 */
package egovframework.example.dept.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptService;
import egovframework.example.dept.service.DeptVO;
import jdk.internal.org.jline.utils.Log;

/**
 * @author simple-coding
 * AutoComplete
 */
@RestController
public class DeptAjaxController {
	@Autowired
	private DeptService deptService;

	@GetMapping("/api/dept/dept.do")
	public List<DeptVO> selectDeptList(@ModelAttribute("searchVO") Criteria criteria) {
		System.out.println(criteria);
		List<DeptVO> list = deptService.selectDeptList(criteria);
		
		return list;
	}	
}
