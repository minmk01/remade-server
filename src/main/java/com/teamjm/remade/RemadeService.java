package com.teamjm.remade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RemadeService {
    private final RemadeRepository remadeRepository;

    public Optional<Post> getPost(Long id) {
        return remadeRepository.findById(id);
    }

    public Post createPost(Post post) {
        return remadeRepository.save(post);
    }
    @Transactional
    public Optional<Post> updatePost(Long id, PostRequestDto postRequestDto) {
        return remadeRepository.findById(id).map(post -> {
            post.setContents(postRequestDto.getContents());
            return remadeRepository.save(post);
        });
    }

}