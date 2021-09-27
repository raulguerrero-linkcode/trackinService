package com.tequila.track.com.tequila.track.service;

import com.tequila.track.com.tequila.track.models.Tracks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class TracksServiceImpl implements iTracksService{

    @Autowired
    private TracksService tracksService;

    @Override
    @Transactional(readOnly = true)
    public List<Tracks> findAlltracks() {
        return (List<Tracks>) tracksService.findAll();
    }

    @Override
    public Optional<Tracks> findById(Long id) {
        return tracksService.findById(id);
    }
}
