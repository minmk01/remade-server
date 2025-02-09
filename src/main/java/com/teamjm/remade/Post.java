package com.teamjm.remade;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDate;


@Entity
@MappedSuperclass
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "Post")
public class Post extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @CreatedDate
    @Column(updatable = false)
    private LocalDate createdDate;

    private LocalDate updatedDate;
    private String post;



}
