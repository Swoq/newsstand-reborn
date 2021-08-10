package com.swoqe.newsstand.model.services.abstractions;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudPageableService<T> extends CrudService<T> {
    Page<T> findAll(Pageable paging);
}
