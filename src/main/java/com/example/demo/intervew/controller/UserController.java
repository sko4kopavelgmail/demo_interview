package com.example.demo.intervew.controller;

import com.example.demo.intervew.model.UserEntity;
import com.example.demo.intervew.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usr")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

}
