package com.projectboard.repository;

import com.projectboard.domain.Board;

import java.util.List;

public interface BoardRepository {

    List<Board> findAll();

    Board findById(int boardNo);

    void save(Board board);

    void update(Board board);

    void delete(int boardNo);
}
