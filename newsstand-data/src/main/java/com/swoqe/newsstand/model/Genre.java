package com.swoqe.newsstand.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre extends BaseEntity {

    private String genreName;

    @Lob
    private String description;

    @ManyToMany(mappedBy = "genres")
    private List<Publication> publications;

}
