package com.swoqe.newsstand.model.dto.abstactions;

import com.swoqe.newsstand.model.domain.FinancialTransaction;
import com.swoqe.newsstand.model.dto.dtos.FinancialTransactionDto;

public interface FinancialTransactionDtoConverter extends GenericConverter<FinancialTransactionDto, FinancialTransaction> {
}
