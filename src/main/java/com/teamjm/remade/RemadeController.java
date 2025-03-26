package com.teamjm.remade;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class RemadeController {

    private final RemadeService remadeService;

    //회고록 조회
    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id) {
        return remadeService.getPost(id).orElse(null);
    }

    //회고록 생성
    @PostMapping("/posts")
    public PostResponseDto createPost(@RequestBody PostRequestDto postRequestDto) {
        Post post = Post.toEntity(postRequestDto);
        Post savedPost = remadeService.createPost(post);
        return PostResponseDto.toDto(savedPost);
    }

    //회고록 수정
    @PutMapping("/posts/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto) {
        Post post = remadeService.updatePost(id, postRequestDto);
        return post;
    }



}