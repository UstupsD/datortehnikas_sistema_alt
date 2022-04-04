package com.datortehnika.datortehnikas_sistema;

import com.datortehnika.datortehnikas_sistema.model.Request;
import com.datortehnika.datortehnikas_sistema.service.requestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Various functions for working with requests
@RestController
@RequestMapping("/request")
public class requestResource {
    private final requestService requestService;

    public requestResource(requestService requestService) {
        this.requestService = requestService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Request>> getAllRequests () {
        List<Request> request = requestService.findAllRequests();
        return new ResponseEntity<>(request, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Request> getRequestById (@PathVariable("id") Long id) {
        Request request = requestService.findRequestById(id);
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Request> addRequest(@RequestBody Request request) {
        Request newRequest = requestService.addRequest(request);
        return new ResponseEntity<>(newRequest, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Request> updateRequest(@RequestBody Request request) {
        Request updateRequest = requestService.updateRequest(request);
        return new ResponseEntity<>(updateRequest, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRequest(@PathVariable("id") Long id) {
        requestService.deleteRequest(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
