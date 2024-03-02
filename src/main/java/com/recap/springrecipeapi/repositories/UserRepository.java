package com.recap.springrecipeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.recap.springrecipeapi.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
}
