package com.project.albamon.recruit.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RecruitResDto {

    private Long id;

    private String title;

    private String address;

    private String content;

    private int viewCount;

    @Builder
    public RecruitResDto(Long id, String title, String address, String content, int viewCount){
        this.id = id;
        this.title = title;
        this.address = address;
        this.content = content;
        this.viewCount = viewCount;
    }
}
