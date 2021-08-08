package com.swoqe.newsstand.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "genres")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre extends BaseEntity {

    @Column(name = "name")
    private String genreName;

    @Lob
    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "genres")
    private Set<Publication> publications;

}
