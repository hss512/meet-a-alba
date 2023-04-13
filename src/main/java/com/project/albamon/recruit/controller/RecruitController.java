package com.project.albamon.recruit.controller;

import com.project.albamon.common.domain.CustomResponse;
import com.project.albamon.common.exception.StatusCode;
import com.project.albamon.common.service.ResponseService;
import com.project.albamon.recruit.dto.RecruitResDto;
import com.project.albamon.recruit.service.RecruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RecruitController {

    private final RecruitService recruitService;
    private final ResponseService responseService;


    @GetMapping("/recruit/{postId}")
    public ResponseEntity<CustomResponse<RecruitResDto>> getRecruit(@PathVariable Long postId){

        RecruitResDto recruitResDto = recruitService.getRecruit(postId);

        CustomResponse<RecruitResDto> response = responseService.createResponse(recruitResDto, StatusCode.SUCCESS);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
