package com.swoqe.newsstand.model.dto.dtos;

import com.swoqe.newsstand.model.dto.abstactions.AbstractDto;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PublicationDto extends AbstractDto {

    private String title;

    private String description;

    private LocalDate publicationDate;

    private String imageUrl;
}
