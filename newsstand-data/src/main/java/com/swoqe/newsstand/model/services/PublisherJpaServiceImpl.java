package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.Publisher;
import com.swoqe.newsstand.model.repositories.PublisherRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.PublisherService;
import org.springframework.stereotype.Service;

@Service
public class PublisherJpaServiceImpl extends AbstractJpaService<Publisher, PublisherRepository> implements PublisherService {

    public PublisherJpaServiceImpl(PublisherRepository repository) {
        super(repository);
    }

}
