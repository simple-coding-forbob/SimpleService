/**
 * 
 */
package egovframework.example.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.common.Criteria;
import egovframework.example.dept.web.DeptController;
import egovframework.example.emp.service.EmpService;
import egovframework.example.emp.service.EmpVO;
import lombok.extern.log4j.Log4j;

/**
 * @author simple-coding
 * AutoComplete
 */
@Log4j
@RestController
public class EmpAjaxController {
	@Autowired
	private EmpService empService;

	@GetMapping("/api/emp/emp.do")
	public List<?> selectEmpList(@ModelAttribute Criteria criteria) {
		log.info(criteria);
		List<?> list = empService.selectEmpList(criteria);
		
		return list;
	}	
}
