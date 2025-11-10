package com.simplecoding.simpleservice.testdata;

import com.simplecoding.simpleservice.board.vo.Board;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 게시판 DB
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Component
@Getter
@Setter
public class SampleBoard {
    List<Board> list = new ArrayList<Board>();

    public SampleBoard() {

        int iCount = 1;

        Board board = Board.builder()
                .id(iCount)
                .title("제목")
                .content("내용")
                .build();

        list.add(board);

        board = Board.builder()
                .id(++iCount)
                .title("제목2")
                .content("내용2")
                .build();

        list.add(board);

        board = Board.builder()
                .id(++iCount)
                .title("제목3")
                .content("내용3")
                .build();

        list.add(board);

        board = Board.builder()
                .id(++iCount)
                .title("제목4")
                .content("내용4")
                .build();

        list.add(board);

        board = Board.builder()
                .id(++iCount)
                .title("제목5")
                .content("내용5")
                .build();

        list.add(board);
    }
}
