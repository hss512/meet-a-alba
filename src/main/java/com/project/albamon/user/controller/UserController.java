package com.project.albamon.user.controller;

import com.project.albamon.user.dto.UserReqDto;
import com.project.albamon.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    /*
     * jwt 사용 로직으로 수정 예정
     * */

    private final UserService userService;

    @PostMapping("/user/signup")
    public ResponseEntity signupUser(@RequestBody UserReqDto userReqDto){

        return new ResponseEntity<>(userService.signupUser(userReqDto), HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity getUser(@PathVariable String userId){

        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
    }

    @PutMapping("/user/{userId}")
    public ResponseEntity updateUser(@PathVariable String userId,
                                     @RequestBody UserReqDto userReqDto){

        userService.updateUser(Long.parseLong(userId), userReqDto);

        return ResponseEntity.ok("ok");
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity deleteUser(@PathVariable String userId){

        userService.deleteUser(Long.parseLong(userId));

        return ResponseEntity.ok("ok");
    }
}
