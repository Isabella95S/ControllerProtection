package com.develhope.ControllerProtection.repositories;

import com.develhope.ControllerProtection.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
