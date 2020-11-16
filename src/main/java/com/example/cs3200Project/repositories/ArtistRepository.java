package com.example.cs3200Project.repositories;

import com.example.cs3200Project.models.Artist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ArtistRepository
        extends CrudRepository<Artist, Integer> {

    @Query(value = "select * from artists where user_id=:user_id", nativeQuery = true)
    Optional<Artist> findArtistByUserId(Integer user_id);
}
