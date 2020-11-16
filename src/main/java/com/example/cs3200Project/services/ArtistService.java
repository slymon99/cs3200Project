package com.example.cs3200Project.services;

import com.example.cs3200Project.models.Artist;
import com.example.cs3200Project.models.User;
import com.example.cs3200Project.repositories.ArtistRepository;
import com.example.cs3200Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Artist> findAllArtists() {
        return (List<Artist>) artistRepository.findAll();
    }

    public Artist findArtistById(Integer artistId){
        Optional<Artist> optionalArtist = artistRepository.findArtistByUserId(artistId);
        return optionalArtist.orElse(null);
    }

    public Artist createArtist(User user) {
        User createdUser = userRepository.save(user);

        Artist newArtist = new Artist(createdUser.getId());
        return artistRepository.save(newArtist);
    }

    public void deleteArtist(Integer id) {
        artistRepository.deleteById(id);
        userRepository.deleteById(id);
    }

}
