package com.teamjm.remade;

import org.springframework.web.bind.annotation.*;

@RestController
public class RemadeController {
    @GetMapping("/posts")
    public String getPostDto(PostDto postDto){

        return postDto.toString();
    }

    @PostMapping(value = "/posts/{id}")
    public String postPostDto(@RequestParam PostDto postDto){
        return postDto.toString();
    }

    @PutMapping(value = "/posts/{id}")
    public String putPostDto(@RequestParam PostDto postDto){
        return postDto.toString();
    }

}
