package com.swoqe.newsstand.model.repositories;

import com.swoqe.newsstand.model.domain.RatePeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePeriodRepository extends JpaRepository<RatePeriod, Long> {
}
