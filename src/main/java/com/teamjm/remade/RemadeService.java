package com.teamjm.remade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;


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
    public Post updatePost(Long id, PostRequestDto postRequestDto) {
        Post post = remadeRepository.findById(id).orElse(null);
        if (post != null) {
            post.updateContents(postRequestDto.getContents());
            return remadeRepository.save(post);
        }
        return null;  // Post가 존재하지 않으면 null 반환
    }


}