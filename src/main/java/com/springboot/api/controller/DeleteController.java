package com.springboot.api.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteController {

    @DeleteMapping("/user")
    public String deleteUser() {
        return "User 'nsj' has been deleted successfully.";
    }
}