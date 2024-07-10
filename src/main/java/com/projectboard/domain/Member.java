package com.projectboard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class Member {
    private int memberNo;
    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;
}
