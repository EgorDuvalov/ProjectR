package com.innowise.projectr.service;

import com.innowise.projectr.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(Long id);
}
