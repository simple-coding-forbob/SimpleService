package egovframework.example.board.service;

import egovframework.example.common.Criteria;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 게시판 VO 클래스
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardVO extends Criteria {

    private Integer id;     // 게시판 번호
    private String title;   // 게시판 제목
    private String content; // 게시판 내용

    @Builder
    public BoardVO(Integer id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
