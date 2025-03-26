package com.teamjm.remade;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PostRequestDto {
    private final Long id;
    private final LocalDate createdDate;
    private final String contents;

    @Builder
    public PostRequestDto(Long id, LocalDate createdDate, String contents) {
        this.id = id;
        this.createdDate = createdDate;
        this.contents = contents;
    }

    public PostRequestDto toBuilder(PostRequestDto dto) {
        return PostRequestDto.builder()
                .id(dto.getId())
                .createdDate(dto.getCreatedDate())
                .contents(dto.getContents())
                .build();
    }
}
