package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.RatePeriod;
import com.swoqe.newsstand.model.repositories.RatePeriodRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.RatePeriodService;
import org.springframework.stereotype.Service;

@Service
public class RatePeriodJpaServiceImpl extends AbstractJpaService<RatePeriod, RatePeriodRepository>
        implements RatePeriodService {

    public RatePeriodJpaServiceImpl(RatePeriodRepository repository) {
        super(repository);
    }

}
