package com.example.cs3200Project.controllers;

import com.example.cs3200Project.models.Artist;
import com.example.cs3200Project.models.Listener;
import com.example.cs3200Project.models.User;
import com.example.cs3200Project.services.ArtistService;
import com.example.cs3200Project.services.ListenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ListenerController {

    @Autowired
    private ListenerService listenerService;

    // ----------------------------------------------------------------------

    @GetMapping("/api/listeners")
    public List<Listener> findAllListeners() {
        return listenerService.findAllListeners();
    }

    // ----------------------------------------------------------------------

    @GetMapping("/api/listeners/listener/{id}")
    public Listener findListenerByID(@PathVariable("id") Integer id) {
        return listenerService.findListenerById(id);
    }

    // ----------------------------------------------------------------------

    @PostMapping("api/listeners")
    public Listener createListener(@RequestBody User user) {
        return listenerService.createListener(user);
    }

    // ----------------------------------------------------------------------

    @DeleteMapping("api/listeners/listener/{id}")
    public void deleteListener(@PathVariable("id") Integer id) {
        listenerService.deleteListener(id);
    }

}
