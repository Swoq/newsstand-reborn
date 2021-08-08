package com.swoqe.newsstand.model.domain;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "transactions")
@NoArgsConstructor
@Immutable
public final class FinancialTransaction extends BaseEntity {

    @Column(nullable = false, name = "instant")
    private Instant instant;

    @Column(nullable = false, name = "status")
    @Enumerated(value = EnumType.STRING)
    private FinancialTransactionStatus status;

    @OneToOne
    @Column(nullable = false)
    private Subscription subscription;

    private FinancialTransaction(Instant timestamp, FinancialTransactionStatus status, Subscription subscription) {
        this.instant = timestamp;
        this.status = status;
        this.subscription = subscription;
    }

    public static FinancialTransaction newInstance(Instant timestamp, FinancialTransactionStatus status, Subscription subscription) {
        return new FinancialTransaction(timestamp, status, subscription);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinancialTransaction)) return false;
        if (!super.equals(o)) return false;

        FinancialTransaction that = (FinancialTransaction) o;

        if (!instant.equals(that.instant)) return false;
        if (status != that.status) return false;
        return subscription.equals(that.subscription);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + instant.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + subscription.hashCode();
        return result;
    }
}
