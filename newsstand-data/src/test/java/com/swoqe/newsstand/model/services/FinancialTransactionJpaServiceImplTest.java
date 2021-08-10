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
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FinancialTransactionJpaServiceImplTest {

    @Mock
    FinancialTransactionRepository repository;

    @InjectMocks
    FinancialTransactionJpaServiceImpl service;

    Long expectedId = 1L;
    FinancialTransaction expectedTransaction;

    @BeforeEach
    void setUp() {
        expectedTransaction = FinancialTransaction.newInstance(1L, Instant.now(), FinancialTransactionStatus.COMPLETED);
    }

    @Test
    void testFindAll() {
        List<FinancialTransaction> transactions = List.of(
                FinancialTransaction.newInstance(1L, Instant.now(), FinancialTransactionStatus.COMPLETED),
                FinancialTransaction.newInstance(2L, Instant.now(), FinancialTransactionStatus.REJECTED),
                FinancialTransaction.newInstance(3L, Instant.now(), FinancialTransactionStatus.COMPLETED));
        when(repository.findAll()).thenReturn(transactions);

        Set<FinancialTransaction> received = service.findAll();
        assertEquals(new HashSet<>(transactions), received);
        assertEquals(3, received.size());
        verify(repository).findAll();
    }

    @Test
    void testFindById() {
        when(repository.findById(expectedId)).thenReturn(Optional.of(expectedTransaction));

        FinancialTransaction received = service.findById(expectedId);

        assertEquals(expectedTransaction, received);
        verify(repository).findById(anyLong());
    }

    @Test
    void testFindByIdNotFound() {
        when(repository.findById(expectedId)).thenReturn(Optional.empty());

        FinancialTransaction received = service.findById(expectedId);

        assertNull(received);
        verify(repository).findById(anyLong());
    }

    @Test
    void testSave() {
        when(repository.save(any(FinancialTransaction.class))).thenReturn(expectedTransaction);

        FinancialTransaction received = service.save(expectedTransaction);

        assertNotNull(received);
        verify(repository).save(any(FinancialTransaction.class));
    }

    @Test
    void testDelete() {
        service.delete(expectedTransaction);
        verify(repository).delete(any(FinancialTransaction.class));
    }

    @Test
    void testDeleteById() {
        service.deleteById(1L);
        verify(repository).deleteById(anyLong());
    }
}