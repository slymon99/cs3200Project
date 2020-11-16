package com.example.cs3200Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlists")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    @JsonIgnore
    private Listener owner;

    private Integer song_count;

    private String name;

    @OneToMany(mappedBy = "playlist")
    private List<PlaylistSong> playlistSongs;

    public Integer getId() {
        return id;
    }

    public Listener getOwner() {
        return owner;
    }

    public Integer getSong_count() {
        return song_count;
    }

    public String getName() {
        return name;
    }

    public List<PlaylistSong> getPlaylistSongs() {
        return playlistSongs;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwner(Listener owner) {
        this.owner = owner;
    }

    public void setSong_count(Integer song_count) {
        this.song_count = song_count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlaylistSongs(List<PlaylistSong> playlistSongs) {
        this.playlistSongs = playlistSongs;
    }
}
