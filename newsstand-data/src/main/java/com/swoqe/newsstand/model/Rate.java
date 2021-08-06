package com.swoqe.newsstand.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rate extends BaseEntity implements Comparable<Rate> {

    private BigDecimal price;

    @ManyToOne
    private RatePeriod ratePeriod;

    @ManyToOne
    private Publication publication;

    @Override
    public int compareTo(Rate o) {
        return price.compareTo(o.price);
    }

}
