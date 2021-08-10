package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.Publication;
import com.swoqe.newsstand.model.repositories.PublicationRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.PublicationService;
import org.springframework.stereotype.Service;

@Service
public class PublicationJpaServiceImpl extends AbstractJpaService<Publication, PublicationRepository>
        implements PublicationService {

    public PublicationJpaServiceImpl(PublicationRepository repository) {
        super(repository);
    }

}
