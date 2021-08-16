package com.swoqe.newsstand.model.dto.abstactions;

import com.swoqe.newsstand.model.domain.Subscription;
import com.swoqe.newsstand.model.dto.dtos.SubscriptionDto;

public interface SubscriptionDtoConverter extends GenericConverter<SubscriptionDto, Subscription> {
}
