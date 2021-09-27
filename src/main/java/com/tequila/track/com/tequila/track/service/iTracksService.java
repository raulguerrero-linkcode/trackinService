package com.tequila.track.com.tequila.track.service;

import com.tequila.track.com.tequila.track.models.Tracks;

import java.util.List;
import java.util.Optional;

public interface iTracksService  {

    public List<Tracks> findAlltracks();
    public Optional<Tracks> findById(Long id);


}
