package com.swoqe.newsstand.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "rates")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Rate extends BaseEntity implements Comparable<Rate> {

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "rate_period_id")
    private RatePeriod ratePeriod;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publication;

    @Override
    public int compareTo(Rate o) {
        return price.compareTo(o.price);
    }

}

