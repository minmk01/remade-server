package com.teamjm.remade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PostRequestDto {
    private Long id;
    private LocalDate createdDate;
    private String contents;
}
