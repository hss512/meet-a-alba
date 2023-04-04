package com.project.albamon.recruit.service;

import com.project.albamon.recruit.domain.Recruit;
import com.project.albamon.recruit.repository.RecruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class RecruitService {

    private final RecruitRepository repository;

    public void get(Long postId) {

        Recruit recruit = repository.findById(postId).get();

    }
}
