package com.jcell.userapp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jcell.userapp.Entities.User;

@Service
public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void delete(Long id);
}
