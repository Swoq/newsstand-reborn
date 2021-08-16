package com.swoqe.newsstand.model.dto.converters;

import com.swoqe.newsstand.model.domain.Genre;
import com.swoqe.newsstand.model.domain.Publication;
import com.swoqe.newsstand.model.dto.abstactions.GenreDtoConverter;
import com.swoqe.newsstand.model.dto.abstactions.PublicationDtoConverter;
import com.swoqe.newsstand.model.dto.dtos.GenreDto;
import com.swoqe.newsstand.model.dto.dtos.PublicationDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class GenreDtoConverterImpl implements GenreDtoConverter {

    private final ModelMapper modelMapper;
    private final PublicationDtoConverter publicationDtoConverter;

    public GenreDtoConverterImpl(ModelMapper modelMapper, PublicationDtoConverter publicationDtoConverter) {
        this.modelMapper = modelMapper;
        this.publicationDtoConverter = publicationDtoConverter;
    }

    @Override
    public Genre createFrom(GenreDto dto) {
        if (dto == null)
            return null;
        Set<Publication> fromDtos = this.publicationDtoConverter.createFromDtos(dto.getPublications());
        Genre map = modelMapper.map(dto, Genre.class);
        map.setPublications(fromDtos);
        return map;
    }

    @Override
    public GenreDto createFrom(Genre entity) {
        if (entity == null)
            return null;
        Set<PublicationDto> fromEntities = this.publicationDtoConverter.createFromEntities(entity.getPublications());
        GenreDto map = modelMapper.map(entity, GenreDto.class);
        map.setPublications(fromEntities);
        return map;
    }

}
