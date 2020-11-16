package com.example.cs3200Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "playlist_songs")
public class PlaylistSong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlist_id")
    @JsonIgnore
    private Playlist playlist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "song_id")
    @JsonIgnore
    private Song song;

    public Integer getId() {
        return id;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public Song getSong() {
        return song;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
