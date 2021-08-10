package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.Genre;
import com.swoqe.newsstand.model.repositories.GenreRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.GenreService;
import org.springframework.stereotype.Service;

@Service
public class GenreJpaServiceImpl extends AbstractJpaService<Genre, GenreRepository> implements GenreService {

    public GenreJpaServiceImpl(GenreRepository repository) {
        super(repository);
    }

}
