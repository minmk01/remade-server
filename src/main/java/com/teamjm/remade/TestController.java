package com.teamjm.remade;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest(@RequestParam Integer page, @RequestParam String title) {
        if (page != 0) {
            return "Not First!";
        }
        return "First!";
    }
}
