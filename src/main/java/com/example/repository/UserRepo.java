package com.example.repository;

import com.example.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
