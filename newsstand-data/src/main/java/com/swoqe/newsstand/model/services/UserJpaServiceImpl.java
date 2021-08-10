package com.swoqe.newsstand.model.services;

import com.swoqe.newsstand.model.domain.User;
import com.swoqe.newsstand.model.repositories.UserRepository;
import com.swoqe.newsstand.model.services.abstractions.AbstractJpaService;
import com.swoqe.newsstand.model.services.abstractions.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserJpaServiceImpl extends AbstractJpaService<User, UserRepository> implements UserService {

    public UserJpaServiceImpl(UserRepository repository) {
        super(repository);
    }

}
