package com.swoqe.newsstand.model.repositories;

import com.swoqe.newsstand.model.domain.FinancialTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialTransactionRepository extends JpaRepository<FinancialTransaction, Long> {
}
