package com.simplecoding.simpleservice.dept.controller;


import com.simplecoding.simpleservice.common.Criteria;
import com.simplecoding.simpleservice.dept.service.DeptService;
import com.simplecoding.simpleservice.dept.vo.Dept;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Log4j2
@Controller
public class DeptController {

	@Autowired
	private DeptService deptService;

	@GetMapping("/dept")
	public String selectDeptList(@ModelAttribute Criteria criteria, Model model) {
		List<?> list = deptService.selectDeptList(criteria);
		model.addAttribute("list", list);

		return "dept/dept_all";
	}

//	부서 추가 페이지 열기 
	@GetMapping("/dept/addition")
	public String addDeptView() {
		return "dept/add_dept";
	}

	@PostMapping("/dept/add")
	public String insert(@ModelAttribute Dept dept) {
		log.info(dept);
		deptService.insert(dept);
		return "redirect:/dept";
	}

//	부서 수정 페이지 열기 (상세 조회)
	@GetMapping("/dept/edition")
	public String updateDeptView(Model model,
					@RequestParam(defaultValue = "0") long dno
								) {
		Dept dept = deptService.selectDept(dno);
		model.addAttribute("dept", dept);

		return "dept/update_dept";
	}

	@PostMapping("/dept/edit")
	public String update(@RequestParam(defaultValue = "0") long dno, 
			                 @ModelAttribute Dept dept) {
		deptService.update(dept);
		return "redirect:/dept";
	}
	
	@PostMapping("/dept/delete")
	public String delete(@RequestParam(defaultValue = "0") long dno) {
		deptService.delete(dno);
		return "redirect:/dept";
	}
}












