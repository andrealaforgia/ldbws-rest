package com.andrealaforgia.ldbwsrest.ldbwsrest.api.controller;

import com.andrealaforgia.ldbwsrest.ldbwsrest.api.model.Station;
import com.andrealaforgia.ldbwsrest.ldbwsrest.api.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stations")
public class StationController {

    @Autowired
    private StationService service;

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public List<Station> getStations() {
        return service.getStations();
    }
}
