package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @GetMapping("/user")
    public PostRequestDto getUser() {
        PostRequestDto dto = new PostRequestDto();
        dto.setName("nsj");
        dto.setEmail("nsj050524@naver.com");
        dto.setAge("21");
        dto.setAddress("suwon");
        dto.setPhoneNumber("010-4653-4380");
        return dto;
    }
}