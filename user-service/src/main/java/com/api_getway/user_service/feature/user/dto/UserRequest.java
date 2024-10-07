package com.api_getway.user_service.feature.user.dto;


import lombok.Builder;

import java.util.Set;

@Builder
public record UserRequest(

        String email,

        String password,

        String name,

        Set<String> roles
) {
}
