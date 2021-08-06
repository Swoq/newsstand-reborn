package com.swoqe.newsstand.model;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Immutable
public final class FinancialTransaction extends BaseEntity {

    @Column(nullable = false)
    private Instant timestamp;

    @Column(nullable = false)
    private FinancialTransactionStatus status;

    @OneToOne
    @Column(nullable = false)
    private Subscription subscription;

    private FinancialTransaction(Instant timestamp, FinancialTransactionStatus status, Subscription subscription) {
        this.timestamp = timestamp;
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

        if (!timestamp.equals(that.timestamp)) return false;
        if (status != that.status) return false;
        return subscription.equals(that.subscription);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + timestamp.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + subscription.hashCode();
        return result;
    }
}
