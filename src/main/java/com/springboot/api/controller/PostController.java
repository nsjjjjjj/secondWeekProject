package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping("/user")
    public PostRequestDto createUser(@RequestBody PostRequestDto dto) {
        return dto;
    }
}