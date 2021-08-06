package com.swoqe.newsstand.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    private String firstName;

    private String lastName;

    private String email;

    private BigDecimal account = BigDecimal.ZERO;

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;

}
