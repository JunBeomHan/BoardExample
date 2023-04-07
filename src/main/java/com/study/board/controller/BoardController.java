package com.study.board.controller;
import com.study.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("/board/write")
    public String boardStringForm() {
        return "boardWrite";
    }

    @PostMapping("/board/writePro")
    public String boardWritePro(Board board) {
        System.out.println(board.getTitle());
        return "";
    }
}
