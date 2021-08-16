package com.swoqe.newsstand.model.dto.converters;

import com.swoqe.newsstand.model.domain.Genre;
import com.swoqe.newsstand.model.domain.Publication;
import com.swoqe.newsstand.model.dto.dtos.GenreDto;
import com.swoqe.newsstand.model.dto.dtos.PublicationDto;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest(classes = {GenreDtoConverterImpl.class, ModelMapper.class, PublicationDtoConverterImpl.class})
class GenreDtoConverterImplTest {

    @Autowired
    GenreDtoConverterImpl converter;

    @Test
    void createFromGenreDto() {
        PublicationDto publicationDto = new PublicationDto();
        publicationDto.setTitle("title1");
        publicationDto.setDescription("description1");
        publicationDto.setPublicationDate(LocalDate.now());
        publicationDto.setImageUrl("url1");

        GenreDto genreDto = new GenreDto("genre1", "description1", Set.of(publicationDto));
        Genre genre = converter.createFrom(genreDto);

        assertEquals(genreDto.getGenreName(), genre.getGenreName());
        assertEquals(genreDto.getDescription(), genre.getDescription());

        Publication next = genre.getPublications().iterator().next();
        String actualTitle = next.getTitle();
        String actualDescription = next.getDescription();
        String actualUrl = next.getImageUrl();
        LocalDate actualPublicationDate = next.getPublicationDate();

        assertEquals(publicationDto.getTitle(), actualTitle);
        assertEquals(publicationDto.getDescription(), actualDescription);
        assertEquals(publicationDto.getPublicationDate(), actualPublicationDate);
        assertEquals(publicationDto.getImageUrl(), actualUrl);

    }

    @Test
    void createFromGenre() {
        Publication publication = new Publication();
        publication.setTitle("title1");
        publication.setDescription("description1");
        publication.setPublicationDate(LocalDate.now());
        publication.setImageUrl("url1");

        Genre genre = new Genre("genre1", "description1", Set.of(publication));
        GenreDto genreDto = converter.createFrom(genre);

        assertEquals(genre.getGenreName(), genreDto.getGenreName());
        assertEquals(genre.getDescription(), genreDto.getDescription());

        PublicationDto next = genreDto.getPublications().iterator().next();
        String actualTitle = next.getTitle();
        String actualDescription = next.getDescription();
        String actualUrl = next.getImageUrl();
        LocalDate actualPublicationDate = next.getPublicationDate();

        assertEquals(publication.getTitle(), actualTitle);
        assertEquals(publication.getDescription(), actualDescription);
        assertEquals(publication.getPublicationDate(), actualPublicationDate);
        assertEquals(publication.getImageUrl(), actualUrl);
    }

    @Test
    void createFromGenreDtoNull() {
        Genre genre = converter.createFrom((GenreDto) null);
        assertNull(genre);
    }

    @Test
    void createFromGenreNull() {
        GenreDto genreDto = converter.createFrom((Genre) null);
        assertNull(genreDto);
    }
}