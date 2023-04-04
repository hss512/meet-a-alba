package com.project.albamon.recruit.controller;

import com.project.albamon.recruit.service.RecruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RecruitController {

    private final RecruitService recruitService;

    @GetMapping("/recruit/{postId}")
    public ResponseEntity get(@PathVariable Long postId){

        recruitService.get(postId);

        return null;
    }
}
