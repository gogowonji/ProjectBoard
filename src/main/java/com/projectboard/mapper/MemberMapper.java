package com.projectboard.mapper;


import com.projectboard.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM member WHERE memberNo = #{memberNo}")
    Member findById(int memberNo);
}
