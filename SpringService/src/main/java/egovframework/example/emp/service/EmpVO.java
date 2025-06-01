package egovframework.example.emp.service;

import egovframework.example.common.Criteria;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : MemberVO 클래스
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class EmpVO extends Criteria {
    private Integer eno;     // 사원번호
    private String ename;    // 사원명
    private String job;      // 직위
    private Integer manager; // 관리자 사원번호

    @Builder
    public EmpVO(Integer eno, String ename, String job, Integer manager) {
        super();
        this.eno = eno;
        this.ename = ename;
        this.job = job;
        this.manager = manager;
    }
}
