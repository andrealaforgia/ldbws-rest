package com.andrealaforgia.ldbwsrest.ldbwsrest.api.service;

import com.andrealaforgia.ldbwsrest.ldbwsrest.api.model.Station;
import com.andrealaforgia.ldbwsrest.ldbwsrest.api.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository repository;

    public List<Station> getStations() {
        return repository.getStations();
    }
}
