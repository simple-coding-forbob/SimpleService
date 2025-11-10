/**
 * 
 */
package com.simplecoding.simpleservice.dept.controller;


import com.simplecoding.simpleservice.common.Criteria;
import com.simplecoding.simpleservice.dept.service.DeptService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simple-coding
 * AutoComplete
 */
@Log4j2
@RestController
public class DeptAjaxController {
	@Autowired
	private DeptService deptService;

	@GetMapping("/api/dept")
	public List<?> selectDeptList(@ModelAttribute Criteria criteria) {
		log.info(criteria);
		List<?> list = deptService.selectDeptList(criteria);
		
		return list;
	}	
}
