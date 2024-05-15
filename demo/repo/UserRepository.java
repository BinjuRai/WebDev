package com.example.demo.repo;

import java.util.List;

public interface UserRepository {
    List<Object> findById(Integer userId);
}
