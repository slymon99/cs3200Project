package com.example.cs3200Project.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "listeners")
public class Listener {

    @Id
    private Integer user_id;

    private Integer playlist_count;

    @OneToMany(mappedBy = "owner")
    private List<Playlist> playlists;

    public Listener() {}

    public Listener(Integer user_id) {
        this.user_id = user_id;
        this.playlist_count = 0;
        this.playlists = new ArrayList<>();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getPlaylist_count() {
        return playlist_count;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setPlaylist_count(Integer playlist_count) {
        this.playlist_count = playlist_count;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

}
