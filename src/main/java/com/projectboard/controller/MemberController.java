package com.projectboard.controller;

import com.projectboard.dto.MemberDto;
import com.projectboard.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/{id}/{password}")
    public String getMemberId(@PathVariable String id, String password, Model model) {

        Optional<MemberDto> member = memberService.login(id, password);

        if (member.isPresent()) {
            model.addAttribute("member", member.get());
        } else {
            model.addAttribute("error", "Member not found");
        }
        return "memberLogin";

    }


}
