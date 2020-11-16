package com.example.cs3200Project.repositories;

import com.example.cs3200Project.models.PlaylistSong;
import org.springframework.data.repository.CrudRepository;

public interface PlaylistSongRepository
        extends CrudRepository<PlaylistSong, Integer> {
}
