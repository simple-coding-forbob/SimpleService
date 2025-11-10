/**
 * 
 */
package com.simplecoding.simpleservice.emp.controller;


import com.simplecoding.simpleservice.common.Criteria;
import com.simplecoding.simpleservice.emp.service.EmpService;
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
public class EmpAjaxController {
	@Autowired
	private EmpService empService;

	@GetMapping("/api/emp")
	public List<?> selectEmpList(@ModelAttribute Criteria criteria) {
		log.info(criteria);
		List<?> list = empService.selectEmpList(criteria);
		
		return list;
	}	
}
