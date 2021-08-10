package com.swoqe.newsstand.model.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "transactions")
@NoArgsConstructor
@ToString
@Getter
@Immutable
public final class FinancialTransaction extends BaseEntity {

    @Column(nullable = false, name = "instant")
    private Instant instant;

    @Column(nullable = false, name = "status")
    @Enumerated(value = EnumType.STRING)
    private FinancialTransactionStatus status;

    private FinancialTransaction(Long id, Instant timestamp, FinancialTransactionStatus status) {
        super(id);
        this.instant = timestamp;
        this.status = status;
    }

    public static FinancialTransaction newInstance(Long id, Instant timestamp, FinancialTransactionStatus status) {
        return new FinancialTransaction(id, timestamp, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinancialTransaction)) return false;
        if (!super.equals(o)) return false;

        FinancialTransaction that = (FinancialTransaction) o;

        if (!instant.equals(that.instant)) return false;
        return status == that.status;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + instant.hashCode();
        result = 31 * result + status.hashCode();
        return result;
    }
}
