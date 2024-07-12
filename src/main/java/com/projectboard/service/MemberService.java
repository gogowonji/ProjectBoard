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

    public Optional<MemberDto> login(String id, String password) {
        Optional<Member> memberRepo = memberRepository.findById(id);
        if (memberRepo.isPresent()) {
            Member member = memberRepo.get();
            if (member.getPassword().equals(password)) {
                MemberDto memberDto = MemberDto.builder()
                        .id(member.getId())
                        .name(member.getName())
                        .email(member.getEmail())
                        .phone(member.getPhone())
                        .build();
                return Optional.of(memberDto);
            }
        }
        return Optional.empty();
    }

}
