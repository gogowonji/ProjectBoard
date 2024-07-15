package com.projectboard.controller;


import com.projectboard.dto.BoardDto;
import com.projectboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BoardController {
    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board")
    public String showBoardList(Model model) {
        List<BoardDto> boards = boardService.findAllBoards();
        model.addAttribute("boards", boards);
        return "basic/board";
    }

    @GetMapping("/board/{boardNo}")
    public String showBoardDetail(@PathVariable int boardNo, Model model) {
        BoardDto board = boardService.findBoardById(boardNo);
        model.addAttribute("board", board);
        return "basic/boardDetail";
    }

}
