package com.projectboard.service;

import com.projectboard.domain.Member;
import com.projectboard.dto.MemberDto;
import com.projectboard.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Optional<MemberDto> findById(int memberNo) {
        Optional<Member> memberRepo = memberRepository.findById(memberNo);
        if (memberRepo.isPresent()) {
            Member member = memberRepo.get();
            MemberDto memberDto = new MemberDto();
            memberDto.setId(member.getId());
            memberDto.setName(member.getName());
            memberDto.setEmail(member.getEmail());
            memberDto.setPhone(member.getPhone());
            return Optional.of(memberDto);


        }
        return Optional.empty();
    }

}
