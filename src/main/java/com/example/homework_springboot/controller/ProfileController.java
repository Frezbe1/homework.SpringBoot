package com.example.homework_springboot.controller;

import com.example.homework_springboot.profile.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ProfileController {
    public SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }
    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}

