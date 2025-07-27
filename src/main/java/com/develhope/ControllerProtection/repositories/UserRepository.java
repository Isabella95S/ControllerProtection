package com.develhope.ControllerProtection.repositories;

import com.develhope.ControllerProtection.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    public Optional<User> findByUsername(String username);
}
