package com.projectboard.mapper;


import com.projectboard.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM board")
    List<Board> findAll();

    Board findById(@Param("boardNo") int boardNo);

    void save(Board board);

    void update(Board board);

    void delete(@Param("boardNo") int boardNo);
}
