package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.repositories.GenreRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GenreJpaServiceImplTest {

    @Mock
    GenreRepository repository;

    @InjectMocks
    GenreJpaServiceImpl service;

    @BeforeEach
    void setUp() {
    }

}