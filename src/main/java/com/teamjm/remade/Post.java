package com.teamjm.remade;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String contents;

    @Builder
    public Post(Long id, String contents){
        this.id = id;
        this.contents = contents;
    }

    public static Post toEntity(PostRequestDto postRequestDto){
        return Post.builder()
                .id(postRequestDto.getId())
                .contents(postRequestDto.getContents())
                .build();
    }
}
