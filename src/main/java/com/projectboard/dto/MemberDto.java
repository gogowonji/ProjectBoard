package com.projectboard.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberDto {
    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;


}
