package com.project.albamon.recruit.controller;

import com.project.albamon.common.domain.CustomResponse;
import com.project.albamon.common.exception.StatusCode;
import com.project.albamon.recruit.dto.RecruitResDto;
import com.project.albamon.recruit.service.RecruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<CustomResponse<RecruitResDto>> getRecruit(@PathVariable Long postId){

        RecruitResDto recruitResDto = recruitService.getRecruit(postId);

        /*
        * Response 코드 간략화 필요
        * */
        return new ResponseEntity<>(new CustomResponse<>(StatusCode.SUCCESS.getStatus(), StatusCode.SUCCESS.getMessage(), recruitResDto), HttpStatus.OK);
    }
}
