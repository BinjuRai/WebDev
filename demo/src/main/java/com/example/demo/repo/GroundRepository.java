package com.example.demo.repo;

import com.example.demo.entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroundRepository extends JpaRepository<Ground, Integer> {
}

