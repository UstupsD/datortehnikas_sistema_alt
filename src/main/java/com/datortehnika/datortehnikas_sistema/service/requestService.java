package com.datortehnika.datortehnikas_sistema.service;

import com.datortehnika.datortehnikas_sistema.exception.requestNotFoundException;
import com.datortehnika.datortehnikas_sistema.model.Request;
import com.datortehnika.datortehnikas_sistema.repository.requestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class requestService {
    private final requestRepo requestRepo;
    // These are all the functions for working with the request entries in the database.
    @Autowired
    public requestService(requestRepo requestRepo) {
        this.requestRepo = requestRepo;
    }

    public Request addRequest(Request request){
        return requestRepo.save(request);
    }

    public List<Request> findAllRequests(){
        return requestRepo.findAll();
    }

    public Request updateRequest(Request request) {
        return requestRepo.save(request);
    }

    public Request findRequestById(Long id){
        return requestRepo.findRequestById(id).orElseThrow(() -> new requestNotFoundException("Error: Request by ID " + id + " was not found!"));
    }

    public void deleteRequest(Long id){
        requestRepo.deleteRequestById(id);
    }
}
