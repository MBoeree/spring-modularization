package com.incentro.modularization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

    private static final String SECRET = "CinnamonIceCream";

    @GetMapping("/secret")
    public String getSecret() {
        return SECRET;
    }
}
