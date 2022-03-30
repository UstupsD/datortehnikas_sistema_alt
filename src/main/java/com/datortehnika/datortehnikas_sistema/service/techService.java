package com.datortehnika.datortehnikas_sistema.service;

import com.datortehnika.datortehnikas_sistema.exception.TechNotFoundException;
import com.datortehnika.datortehnikas_sistema.model.Tech;
import com.datortehnika.datortehnikas_sistema.repository.techRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class techService {
    private final techRepo techRepo;
    // These are all the functions for working with the tech entries in the database.
    @Autowired
    public techService(com.datortehnika.datortehnikas_sistema.repository.techRepo techRepo) {
        this.techRepo = techRepo;
    }

    public Tech addTech(Tech tech){
        return techRepo.save(tech);
    }

    public List<Tech> findAllTech(){
        return techRepo.findAll();
    }

    public Tech updateTech(Tech tech) {
        return techRepo.save(tech);
    }

    public Tech findTechById(Long id){
        return techRepo.findTechById(id).orElseThrow(() -> new TechNotFoundException("Error: Tech by ID " + id + " was not found!"));
    }

    public void deleteTech(Long id){
        techRepo.deleteTechById(id);
    }
}
