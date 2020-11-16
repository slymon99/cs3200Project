package com.example.cs3200Project.repositories;

import com.example.cs3200Project.models.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository
        extends CrudRepository<Song, Integer> {
}
