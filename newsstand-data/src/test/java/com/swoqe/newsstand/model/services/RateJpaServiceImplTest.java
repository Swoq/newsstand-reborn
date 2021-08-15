package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.repositories.RateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RateJpaServiceImplTest {

    @Mock
    RateRepository repository;

    @InjectMocks
    RateJpaServiceImpl service;

    @BeforeEach
    void setUp() {
    }
}