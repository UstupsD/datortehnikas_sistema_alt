package com.datortehnika.datortehnikas_sistema;

import com.datortehnika.datortehnikas_sistema.model.Tech;
import com.datortehnika.datortehnikas_sistema.service.techService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//ToDo Fill this out.
@RestController
@RequestMapping("/tech")
public class techResource {
    private final techService techService;

    public techResource(techService techService) {
        this.techService = techService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tech>> getAllTech () {
        List<Tech> tech = techService.findAllTech();
        return new ResponseEntity<>(tech, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Tech> getTechById (@PathVariable("id") Long id) {
        Tech tech = techService.findTechById(id);
        return new ResponseEntity<>(tech, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Tech> addTech(@RequestBody Tech tech) {
        Tech newTech = techService.addTech(tech);
        return new ResponseEntity<>(newTech, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Tech> updateTech(@RequestBody Tech tech) {
        Tech updateTech = techService.updateTech(tech);
        return new ResponseEntity<>(updateTech, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTech(@PathVariable("id") Long id) {
        techService.deleteTech(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
