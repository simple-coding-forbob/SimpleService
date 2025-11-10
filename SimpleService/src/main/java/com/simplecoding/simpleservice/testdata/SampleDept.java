package com.simplecoding.simpleservice.testdata;

import com.simplecoding.simpleservice.dept.vo.Dept;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 부서 DB
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Component
@Getter
@Setter
public class SampleDept {
    List<Dept> list = new ArrayList<Dept>();

    public SampleDept() {

    	Dept dept = Dept.builder()
                .dno(10)
                .dname("Accounting")
                .loc("Pusan")
                .build();

        list.add(dept);

        dept = Dept.builder()
                .dno(20)
                .dname("Marketing")
                .loc("Seoul")
                .build();

        list.add(dept);

        dept = Dept.builder()
                .dno(30)
                .dname("Sales")
                .loc("DaeGu")
                .build();

        list.add(dept);

        dept = Dept.builder()
                .dno(40)
                .dname("Development")
                .loc("Seoul")
                .build();

        list.add(dept);
    }
}
