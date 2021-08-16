package com.swoqe.newsstand.model.dto.dtos;

import com.swoqe.newsstand.model.dto.abstactions.AbstractDto;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GenreDto extends AbstractDto {
    private String genreName;

    private String description;

    private Set<PublicationDto> publications;
}
