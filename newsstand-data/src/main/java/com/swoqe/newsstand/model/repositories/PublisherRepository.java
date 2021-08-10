package com.swoqe.newsstand.model.repositories;

import com.swoqe.newsstand.model.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
