package com.projectboard.repository;



import com.projectboard.domain.Member;
import com.projectboard.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberMapper memberMapper;

    @Autowired
    public MemberRepositoryImpl(MemberMapper memberMapper) {

        this.memberMapper = memberMapper;
    }

    @Override
    public Optional<Member> findById(int memberNo) {
        return Optional.ofNullable(memberMapper.findById(memberNo));
    }
}
