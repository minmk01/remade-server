package com.teamjm.remade;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Post extends BaseEntity {



    @Column(nullable = false)
    private String contents;

    @Builder
    public Post(String contents){
        this.contents = contents;
    }

    public static Post toEntity(PostRequestDto postRequestDto){
        return Post.builder()
                .contents(postRequestDto.getContents())
                .build();
    }

    public void updateContents(String contents) {
        this.contents = contents;
    }
}
