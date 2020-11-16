package com.example.cs3200Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer song_count;

    private String title;

    private String cover_art_url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id")
    @JsonIgnore
    private Artist artist;

    public Integer getId() {
        return id;
    }

    public Integer getSong_count() {
        return song_count;
    }

    public String getTitle() {
        return title;
    }

    public String getCover_art_url() {
        return cover_art_url;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSong_count(Integer song_count) {
        this.song_count = song_count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCover_art_url(String cover_art_url) {
        this.cover_art_url = cover_art_url;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
