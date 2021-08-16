package com.swoqe.newsstand.model.dto.abstactions;

import com.swoqe.newsstand.model.domain.User;
import com.swoqe.newsstand.model.dto.dtos.UserDto;

public interface UserDtoConverter extends GenericConverter<UserDto, User> {
}
