package com.example.cs3200Project.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "album_id")
    private Album album;

    private String audio_url;

    private Integer runtime;

    @OneToMany(mappedBy = "song")
    private List<PlaylistSong> playlistSongs;


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Album getAlbum() {
        return album;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public List<PlaylistSong> getPlaylistSongs() {
        return playlistSongs;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public void setPlaylistSongs(List<PlaylistSong> playlistSongs) {
        this.playlistSongs = playlistSongs;
    }
}
