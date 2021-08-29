package com.balitan.ourWay.repositories;

import com.balitan.ourWay.login.User;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);
}
