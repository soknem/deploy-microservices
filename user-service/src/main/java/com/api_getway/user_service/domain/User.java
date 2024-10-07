package com.api_getway.user_service.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private Boolean isEnabled;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Role> roles;
}
