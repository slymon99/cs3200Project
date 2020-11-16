package com.example.cs3200Project.repositories;

import com.example.cs3200Project.models.Listener;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ListenerRepository
        extends CrudRepository<Listener, Integer> {

    @Query(value = "select * from listeners where user_id=:user_id", nativeQuery = true)
    Optional<Listener> findListenerByUserId(Integer user_id);
}
