package com.project.albamon.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum StatusCode {
    SUCCESS(200, "성공"),
    FAIL(500, "실패"),

    NOT_FOUND_USER(404, "찾을 수 없는 이용자입니다"),
    Not_FOUND_RECRUIT_POST(404, "찾을 수 없는 모집 게시물입니다")

    ;

    private int status;
    private String message;
}
