package com.projectboard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private int authorId;
    private Date createdDate;
    private Date updatedDate;
}
