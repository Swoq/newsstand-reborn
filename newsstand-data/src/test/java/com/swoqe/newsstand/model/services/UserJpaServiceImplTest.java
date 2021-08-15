package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserJpaServiceImplTest {

    @Mock
    UserRepository repository;

    @InjectMocks
    SubscriptionJpaServiceImpl service;

    @BeforeEach
    void setUp() {
    }
}