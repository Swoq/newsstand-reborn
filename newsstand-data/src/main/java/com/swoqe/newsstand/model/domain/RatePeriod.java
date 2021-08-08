package com.swoqe.newsstand.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "periods")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class RatePeriod extends BaseEntity {

    @Column(name = "days")
    private Integer days;

    @Column(name = "formal_name")
    private String formalName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "ratePeriod")
    private List<Rate> rates;
}
