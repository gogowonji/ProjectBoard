package com.projectboard.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class BoardDto {
    private int boardNo;
    private String title;
    private String content;
    private int authorId;
    private Date createdDate;
    private Date updatedDate;
}

