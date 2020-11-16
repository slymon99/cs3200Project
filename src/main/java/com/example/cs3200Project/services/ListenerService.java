package com.example.cs3200Project.services;

import com.example.cs3200Project.models.Artist;
import com.example.cs3200Project.models.Listener;
import com.example.cs3200Project.models.User;
import com.example.cs3200Project.repositories.ArtistRepository;
import com.example.cs3200Project.repositories.ListenerRepository;
import com.example.cs3200Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListenerService {

    @Autowired
    private ListenerRepository listenerRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Listener> findAllListeners() {
        return (List<Listener>) listenerRepository.findAll();
    }

    public Listener findListenerById(Integer artistId){
        Optional<Listener> optionalListener = listenerRepository.findById(artistId);
        return optionalListener.orElse(null);
    }

    public Listener createListener(User user) {
        User createdUser = userRepository.save(user);

        Listener newListener = new Listener(createdUser.getId());
        return listenerRepository.save(newListener);
    }

    public void deleteListener(Integer id) {
        listenerRepository.deleteById(id);
        userRepository.deleteById(id);
    }
}
