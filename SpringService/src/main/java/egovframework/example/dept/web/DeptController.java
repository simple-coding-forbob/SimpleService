package egovframework.example.dept.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptService;
import egovframework.example.dept.service.DeptVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class DeptController {

	@Autowired
	private DeptService deptService;

	@GetMapping("/dept/dept.do")
	public String selectDeptList(@ModelAttribute("searchVO") Criteria criteria, Model model) {
		List<?> list = deptService.selectDeptList(criteria);
		model.addAttribute("list", list);

		return "dept/dept_all";
	}

//	부서 추가 페이지 열기 
	@GetMapping("/dept/addition.do")
	public String addDeptView() {
		return "dept/add_dept";
	}

	@PostMapping("/dept/add.do")
	public String insert(@ModelAttribute DeptVO deptVO) {
		log.info(deptVO);
		deptService.insert(deptVO);
		return "redirect:/dept/dept.do";
	}

//	부서 수정 페이지 열기 (상세 조회)
	@GetMapping("/dept/edition.do")
	public String updateDeptView(Model model,
					@RequestParam(defaultValue = "0") long dno
								) {
		DeptVO deptVO = deptService.selectDept(dno);
		model.addAttribute("deptVO", deptVO);

		return "dept/update_dept";
	}

	@PostMapping("/dept/edit.do")
	public String update(@RequestParam(defaultValue = "0") long dno, 
			                 @ModelAttribute DeptVO deptVO) {
		deptService.update(deptVO);
		return "redirect:/dept/dept.do";
	}
	
	@PostMapping("/dept/delete.do")
	public String delete(@RequestParam(defaultValue = "0") long dno) {
		deptService.delete(dno);
		return "redirect:/dept/dept.do";
	}
}












