package com.teamjm.remade;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class PostResponseDto {
    private Long id;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private String contents;

    public PostResponseDto(Long id, LocalDate createdDate, LocalDate updatedDate, String contents){
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.contents = contents;
    }

    public static PostResponseDto toDto(Post post){
        return PostResponseDto.builder()
                .id(post.getId())
                .createdDate(post.getCreatedDate())
                .updatedDate(post.getUpdatedDate())
                .contents(post.getContents())
                .build();
    }
}
