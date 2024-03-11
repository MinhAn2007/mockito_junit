package com.example.demo.services;

import com.example.demo.modules.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> find(Long id) {
        return userRepository.findById(id);
    }
    public User save(User user) {
        return userRepository.save(user);
    }

}
