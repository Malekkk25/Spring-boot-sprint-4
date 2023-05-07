package com.malek.vols.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malek.vols.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String username);
}
