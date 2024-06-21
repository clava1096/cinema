package com.cringe.SocialNW.repository.database.implementation;

import com.cringe.SocialNW.domain.model.User;
import com.cringe.SocialNW.repository.database.interfaces.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServiceImpl {
    private userRepository userRepository;

    @Autowired
    public userServiceImpl(userRepository clientRepository) {
        this.userRepository = clientRepository;
    }
    public User save(User user) {
        return userRepository.save(user);
    }

    public String create(User client) {
        try {
            save(client);
        }
        catch (Exception e){
            return "Exception~";
        }
        return "Done~";
    }

    public List<User> readAll() {
        return userRepository.findAll();
    }

    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public UserDetailsService userDetailsService() {
        return this::findUserByUsername;
    }

    public User getCurrentUser() {
        // ѕолучение имени пользовател€ из контекста Spring Security
        var username = SecurityContextHolder.getContext().getAuthentication().getName();
        return findUserByUsername(username);
    }

    public User read(int id) {
        return userRepository.getOne(id);
    }

    public boolean update(User client, int id) {
        if (userRepository.existsById(id)) {
            client.setId(id);
            userRepository.save(client);
            return true;
        }

        return false;
    }

    public boolean delete(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
