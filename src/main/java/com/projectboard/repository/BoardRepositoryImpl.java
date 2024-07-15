package com.projectboard.repository;

import com.projectboard.domain.Board;
import com.projectboard.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepositoryImpl implements BoardRepository {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardRepositoryImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public List<Board> findAll() {
        return boardMapper.findAll();
    }

    @Override
    public Board findById(int boardNo) {
        return boardMapper.findById(boardNo);
    }

    @Override
    public void save(Board board) {
        boardMapper.save(board);
    }

    @Override
    public void update(Board board) {
        boardMapper.update(board);
    }

    @Override
    public void delete(int boardNo) {
        boardMapper.delete(boardNo);
    }


}
