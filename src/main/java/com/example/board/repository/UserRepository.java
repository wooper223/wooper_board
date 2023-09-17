package com.example.board.repository;

import com.example.board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {
    public Optional<User> findByUserId(String userId);

    public Optional<User> findTop1ByOrderByUserNo();

    public List<User> findAll();
}
