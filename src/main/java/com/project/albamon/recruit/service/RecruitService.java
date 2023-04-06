package com.project.albamon.recruit.service;

import com.project.albamon.common.exception.CustomException;
import com.project.albamon.common.exception.StatusCode;
import com.project.albamon.recruit.domain.Recruit;
import com.project.albamon.recruit.dto.RecruitResDto;
import com.project.albamon.recruit.repository.RecruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class RecruitService {

    private final RecruitRepository repository;

    public RecruitResDto getRecruit(Long postId) {

        Recruit recruit = repository.findById(postId).orElseThrow(() -> new CustomException(StatusCode.Not_FOUND_RECRUIT_POST));

        RecruitResDto recruitResDto = RecruitResDto.builder()
                .id(recruit.getId())
                .title(recruit.getTitle())
                .content(recruit.getContent())
                .address(recruit.getAddress())
                .viewCount(recruit.getViewCount())
                .build();

        return recruitResDto;
    }
}
