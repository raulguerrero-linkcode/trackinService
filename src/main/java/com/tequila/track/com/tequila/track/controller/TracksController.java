package com.tequila.track.com.tequila.track.controller;


import com.tequila.track.com.tequila.track.models.Tracks;
import com.tequila.track.com.tequila.track.service.TracksService;
import com.tequila.track.com.tequila.track.service.iTracksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/track")
public class TracksController {

    @Autowired
    private iTracksService tracksService;


    @GetMapping("/")
    public List<Tracks> getAllTracks(){
        return tracksService.findAlltracks();
    }


    @GetMapping("/id")
    public List<Optional<Tracks>> GetAll(@RequestBody ArrayList<Long> esqReq){
        List<Optional<Tracks>> sqRes = new ArrayList<>();

        for (int i = 0 ; i<esqReq.size(); i++) {
            sqRes.add(tracksService.findById(esqReq.get(i)));
        }
        return sqRes;
    }



}
