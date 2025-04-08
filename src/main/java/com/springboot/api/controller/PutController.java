package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutController {

    @PutMapping("/user")
    public PostRequestDto updateUser(@RequestBody PostRequestDto dto) {
        // 받은 정보 중 address만 수정해 반환
        dto.setAddress("Updated Address by nsj");
        return dto;
    }
}