package ru.zooshop.conrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MainController {
    @GetMapping
    public String getTest( ) {
        return "it's start";
    }
}
