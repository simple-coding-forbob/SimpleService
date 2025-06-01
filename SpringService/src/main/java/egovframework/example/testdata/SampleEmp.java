package egovframework.example.testdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import egovframework.example.emp.service.EmpVO;
import lombok.Getter;
import lombok.Setter;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 회원 DB
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Component
@Getter
@Setter
public class SampleEmp {
    List<EmpVO> list = new ArrayList<EmpVO>();

    public SampleEmp() {

    	EmpVO emp = EmpVO.builder()
                .eno(7369)
                .ename("SMITH")
                .job("CLERK")
                .manager(7902)
                .build();
        list.add(emp);

        emp = EmpVO.builder()
                .eno(7499)
                .ename("SCOTT")
                .job("CLERK")
                .manager(7698)
                .build();
        list.add(emp);

        emp = EmpVO.builder()
                .eno(7521)
                .ename("JAMES")
                .job("CLERK")
                .manager(7698)
                .build();
        list.add(emp);

        emp = EmpVO.builder()
                .eno(7566)
                .ename("KING")
                .job("CLERK")
                .manager(7839)
                .build();
        list.add(emp);

        emp = EmpVO.builder()
                .eno(7654)
                .ename("BREAD")
                .job("CLERK")
                .manager(7698)
                .build();
        list.add(emp);

    }
}
