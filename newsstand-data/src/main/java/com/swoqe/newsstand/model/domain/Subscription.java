package com.swoqe.newsstand.model.domain;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "subscriptions")
@NoArgsConstructor
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

    private Subscription(LocalDate startDate, LocalDate endDate, User user, Rate rate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.rate = rate;
    }

    public static Subscription getInstance(LocalDate startDate, LocalDate endDate, User user, Rate rate) {
        return new Subscription(startDate, endDate, user, rate);
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
        return rate.equals(that.rate);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + rate.hashCode();
        return result;
    }
}
