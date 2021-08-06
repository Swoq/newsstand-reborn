package com.swoqe.newsstand.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publication extends BaseEntity {

    private String title;

    private String description;

    private LocalDate publicationDate;

    private String imageUrl;

    @OneToMany(mappedBy = "publication")
    private List<Rate> rates;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    @JoinTable(
            name = "publications_genres",
            joinColumns = @JoinColumn(name = "publication_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;
}
