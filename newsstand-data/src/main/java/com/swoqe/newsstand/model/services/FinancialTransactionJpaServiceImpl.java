package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.FinancialTransaction;
import com.swoqe.newsstand.model.repositories.FinancialTransactionRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.FinancialTransactionService;

public class FinancialTransactionJpaServiceImpl
        extends AbstractJpaService<FinancialTransaction, FinancialTransactionRepository>
        implements FinancialTransactionService {
    public FinancialTransactionJpaServiceImpl(FinancialTransactionRepository repository) {
        super(repository);
    }
}
