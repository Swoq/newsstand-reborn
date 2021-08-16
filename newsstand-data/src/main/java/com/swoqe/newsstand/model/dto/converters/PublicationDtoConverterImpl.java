package com.swoqe.newsstand.model.dto.converters;

import com.swoqe.newsstand.model.domain.Publication;
import com.swoqe.newsstand.model.dto.abstactions.PublicationDtoConverter;
import com.swoqe.newsstand.model.dto.dtos.PublicationDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PublicationDtoConverterImpl implements PublicationDtoConverter {

    private final ModelMapper modelMapper;

    public PublicationDtoConverterImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public Publication createFrom(PublicationDto dto) {
        return dto == null ? null : modelMapper.map(dto, Publication.class);
    }

    @Override
    public PublicationDto createFrom(Publication entity) {
        return entity == null ? null : modelMapper.map(entity, PublicationDto.class);
    }
}
