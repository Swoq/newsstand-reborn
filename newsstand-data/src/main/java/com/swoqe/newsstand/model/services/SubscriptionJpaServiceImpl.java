package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.Subscription;
import com.swoqe.newsstand.model.repositories.SubscriptionRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionJpaServiceImpl extends AbstractJpaService<Subscription, SubscriptionRepository>
        implements SubscriptionService {

    public SubscriptionJpaServiceImpl(SubscriptionRepository repository) {
        super(repository);
    }

}
