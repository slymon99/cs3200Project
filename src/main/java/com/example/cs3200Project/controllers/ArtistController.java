package com.example.cs3200Project.controllers;

import com.example.cs3200Project.models.Artist;
import com.example.cs3200Project.models.User;
import com.example.cs3200Project.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    // ----------------------------------------------------------------------

    @GetMapping("/api/artists")
    public List<Artist> findAllArtists() {
        return artistService.findAllArtists();
    }

    // ----------------------------------------------------------------------

    @GetMapping("/api/artists/artist/{id}")
    public Artist findArtistByID(@PathVariable("id") Integer id) {
        return artistService.findArtistById(id);
    }

    // ----------------------------------------------------------------------

    @PostMapping("api/artists")
    public Artist createArtist(@RequestBody User user) {
        return artistService.createArtist(user);
    }

    // ----------------------------------------------------------------------

    @DeleteMapping("api/artists/artist/{id}")
    public void deleteArtist(@PathVariable("id") Integer id) {
        artistService.deleteArtist(id);
    }

}
