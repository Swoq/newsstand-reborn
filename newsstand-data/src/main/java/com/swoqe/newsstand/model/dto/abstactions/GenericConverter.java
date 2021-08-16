package com.swoqe.newsstand.model.dto.abstactions;

import com.swoqe.newsstand.model.domain.BaseEntity;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public interface GenericConverter<D extends AbstractDto, E extends BaseEntity> {

    E createFrom(D dto);

    D createFrom(E entity);

    default Set<D> createFromEntities(final Collection<E> entities) {
        return entities.stream()
                .map(this::createFrom)
                .collect(Collectors.toSet());
    }

    default Set<E> createFromDtos(final Collection<D> dtos) {
        return dtos.stream()
                .map(this::createFrom)
                .collect(Collectors.toSet());
    }

}