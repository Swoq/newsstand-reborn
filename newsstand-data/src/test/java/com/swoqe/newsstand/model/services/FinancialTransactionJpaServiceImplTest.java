package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.FinancialTransaction;
import com.swoqe.newsstand.model.domain.FinancialTransactionStatus;
import com.swoqe.newsstand.model.repositories.FinancialTransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FinancialTransactionJpaServiceImplTest {

    @Mock
    FinancialTransactionRepository repository;

    @InjectMocks
    FinancialTransactionJpaServiceImpl service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testFindAll() {
        List<FinancialTransaction> transactions = List.of(
                FinancialTransaction.newInstance(Instant.now(), FinancialTransactionStatus.COMPLETED),
                FinancialTransaction.newInstance(Instant.now(), FinancialTransactionStatus.REJECTED),
                FinancialTransaction.newInstance(Instant.now(), FinancialTransactionStatus.COMPLETED));
        when(repository.findAll()).thenReturn(transactions);

        assertEquals(new HashSet<>(transactions), service.findAll());
    }

    @Test
    void testFindById() {
    }

    @Test
    void testSave() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void testDeleteById() {
    }
}