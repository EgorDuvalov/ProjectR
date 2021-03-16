package com.innowise.projectr.service.impl;

import com.innowise.projectr.entity.User;
import com.innowise.projectr.repositories.UserRepository;
import com.innowise.projectr.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Service
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User getUserByLogin(String login) {
        return userRepository.getUserByLogin(login);
    }
}
