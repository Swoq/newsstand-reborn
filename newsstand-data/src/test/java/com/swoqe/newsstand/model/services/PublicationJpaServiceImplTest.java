package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.repositories.PublicationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PublicationJpaServiceImplTest {

    @Mock
    PublicationRepository repository;

    @InjectMocks
    PublicationJpaServiceImpl service;

    @BeforeEach
    void setUp() {
    }
}