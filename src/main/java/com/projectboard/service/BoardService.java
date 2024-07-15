package com.projectboard.service;

import com.projectboard.domain.Board;
import com.projectboard.dto.BoardDto;
import com.projectboard.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<BoardDto> findAllBoards() {
        List<Board> boards = boardRepository.findAll();
        log.info("Boards found: {}", boards.size());
        log.info("boards : {}", boards);
        return boards.stream()
                .map(board -> BoardDto.builder()
                        .boardNo(board.getBoardNo())
                        .title(board.getTitle())
                        .content(board.getContent())
                        .authorId(board.getAuthorId())
                        .createdDate(board.getCreatedDate())
                        .updatedDate(board.getUpdatedDate())
                        .build())
                .collect(Collectors.toList());
    }
}
