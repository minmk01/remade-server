package com.teamjm.remade;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class RemadeController {

    private final RemadeService remadeService;

    //회고록 생성
    @GetMapping("/posts/{id}")
    public Optional<Post> getPost(@PathVariable Long id) {
        return remadeService.getPost(id);
    }

    //회고록 조회
    @PostMapping("/posts")
    public PostResponseDto createPost(@RequestBody PostRequestDto postRequestDto) {
        Post post = Post.toEntity(postRequestDto);
        Post savedPost = remadeService.createPost(post);
        return PostResponseDto.toDto(savedPost);
    }

    //회고록 수정
    @PutMapping("/posts/{id}")
    public Optional<Post> updatePost(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto) {
        return remadeService.updatePost(id, postRequestDto);
    }


}