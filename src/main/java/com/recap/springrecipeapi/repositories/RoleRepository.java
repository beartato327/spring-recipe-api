package com.recap.springrecipeapi.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.recap.springrecipeapi.models.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer>{
    Optional<Roles> findByRole(String role);
} 