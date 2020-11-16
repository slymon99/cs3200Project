package com.example.cs3200Project.models;

import com.example.cs3200Project.services.ArtistService;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    private Integer user_id;

    private Integer album_count;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums;

    public Artist() {}

    public Artist(Integer user_id) {
        this.user_id = user_id;
        this.album_count = 0;
        this.albums = new ArrayList<>();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getAlbum_count() {
        return album_count;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setAlbum_count(Integer album_count) {
        this.album_count = album_count;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
