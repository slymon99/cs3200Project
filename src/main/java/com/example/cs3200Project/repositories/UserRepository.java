package com.example.cs3200Project.repositories;

import com.example.cs3200Project.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, Integer> {
}
