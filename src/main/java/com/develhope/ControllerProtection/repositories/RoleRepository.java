package com.develhope.ControllerProtection.repositories;

import com.develhope.ControllerProtection.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
