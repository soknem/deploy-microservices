package com.api_getway.user_service.mapper;

import com.api_getway.user_service.domain.User;
import com.api_getway.user_service.feature.user.dto.UserRequest;
import com.api_getway.user_service.feature.user.dto.UserResponse;
import com.api_getway.user_service.feature.user.dto.UserUpdateRequest;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "roles", ignore = true)
    User fromUserRequest(UserRequest userRequest);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromRequest(@MappingTarget User user, UserUpdateRequest userRequest);

    UserResponse toUserResponse(User user);


}
