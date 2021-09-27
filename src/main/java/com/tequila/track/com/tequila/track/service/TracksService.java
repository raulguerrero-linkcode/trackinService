package com.tequila.track.com.tequila.track.service;

import com.tequila.track.com.tequila.track.models.Tracks;
import org.springframework.data.repository.CrudRepository;

public interface TracksService extends CrudRepository<Tracks, Long> {
}
