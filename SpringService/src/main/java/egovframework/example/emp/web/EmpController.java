package egovframework.example.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.common.Criteria;
import egovframework.example.emp.service.EmpService;
import egovframework.example.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/emp/emp.do")
	public String selectEmpList(@ModelAttribute Criteria criteria, Model model) {
		
		List<?> list = empService.selectEmpList(criteria);
		model.addAttribute("list", list);
		return "emp/emp_all";
	}
	
//	멤버 추가 페이지 열기 
	@GetMapping("/emp/addition.do")
	public String addMemberView() {
		return "emp/add_emp";
	}
	
	@PostMapping("/emp/add.do")
	public String insert(@ModelAttribute EmpVO empVO) {
		empService.insert(empVO);
		return "redirect:/emp/emp.do";
	}
	
//	상세조회페이지(수정페이지) 열기
	@GetMapping("/emp/edition.do")
	public String updateMemberView(@RequestParam(defaultValue = "0") long eno,
									Model model
			) {
		EmpVO empVO = empService.selectEmp(eno);
		model.addAttribute("empVO", empVO);
		return "emp/update_emp";
	}
	
	@PostMapping("/emp/edit.do")
	public String update(@RequestParam(defaultValue = "0") long eno, 
			                 @ModelAttribute EmpVO empVO) {
		empService.update(empVO);
		return "redirect:/emp/emp.do";
	}
	
	@PostMapping("/emp/delete.do")
	public String delete(@RequestParam(defaultValue = "0") long eno) {
		empService.delete(eno);
		return "redirect:/emp/emp.do";
	}
}




