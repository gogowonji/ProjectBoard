package com.projectboard.controller;

import com.projectboard.dto.MemberDto;
import com.projectboard.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class MemberController {
    private static final Logger log = LoggerFactory.getLogger(MemberController.class);
    private final MemberService memberService;
    /*
        하나의 컨트롤러에 member와 관련된 모든 요청을 처리할 수 있도록 해야 함
     */

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "index";
    }


    @PostMapping("/login")
    public String login(@RequestParam String id, @RequestParam String password, Model model) {
        Optional<MemberDto> member = memberService.login(id, password);
        if (member.isPresent()) {
            model.addAttribute("member", member.get());
            return "redirect:/board";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "index";
        }
    }


}
