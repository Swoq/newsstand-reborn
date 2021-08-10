package com.swoqe.newsstand.model.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "subscriptions")
@NoArgsConstructor
@ToString(exclude = {"user", "rate"})
@Getter
@Immutable
public final class Subscription extends BaseEntity {

    @Column(nullable = false, name = "start_date")
    private LocalDate startDate;

    @Column(nullable = false, name = "end_date")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "rate_id")
    @Column(nullable = false)
    private Rate rate;

    @OneToOne
    @JoinColumn(name = "transaction_id")
    @Column(nullable = false)
    private FinancialTransaction transaction;

    private Subscription(LocalDate startDate, LocalDate endDate, User user, Rate rate, FinancialTransaction transaction) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.rate = rate;
    }

    public static Subscription getInstance(LocalDate startDate, LocalDate endDate, User user,
                                           Rate rate, FinancialTransaction transaction) {
        return new Subscription(startDate, endDate, user, rate, transaction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscription)) return false;
        if (!super.equals(o)) return false;

        Subscription that = (Subscription) o;

        if (!startDate.equals(that.startDate)) return false;
        if (!endDate.equals(that.endDate)) return false;
        if (!user.equals(that.user)) return false;
        if (!rate.equals(that.rate)) return false;
        return transaction.equals(that.transaction);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + rate.hashCode();
        result = 31 * result + transaction.hashCode();
        return result;
    }
}
