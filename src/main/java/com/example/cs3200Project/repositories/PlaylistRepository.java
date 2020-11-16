package com.example.cs3200Project.repositories;

import com.example.cs3200Project.models.Playlist;
import org.springframework.data.repository.CrudRepository;

public interface PlaylistRepository
        extends CrudRepository<Playlist, Integer> {
}
