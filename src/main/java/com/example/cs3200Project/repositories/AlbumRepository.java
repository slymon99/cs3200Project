package com.example.cs3200Project.repositories;

import com.example.cs3200Project.models.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository
        extends CrudRepository<Album, Integer> {
}

