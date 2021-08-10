package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.Rate;
import com.swoqe.newsstand.model.repositories.RateRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.RateService;
import org.springframework.stereotype.Service;

@Service
public class RateJpaServiceImpl extends AbstractJpaService<Rate, RateRepository> implements RateService {

    public RateJpaServiceImpl(RateRepository repository) {
        super(repository);
    }

}
