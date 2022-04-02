package com.datortehnika.datortehnikas_sistema;

import com.datortehnika.datortehnikas_sistema.appUser.AppUser;

import com.datortehnika.datortehnikas_sistema.service.userService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// This is the rest controller for the users
// All the below is necessary to have URLs for each of the functions regarding users
@RestController
@RequestMapping("/user")
public class userResource {
    private final userService userService;

    public userResource(userService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<AppUser>> getAllUsers () {
        List<AppUser> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<AppUser> getUserById (@PathVariable("id") Long id) {
        AppUser user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<AppUser> updateUser(@RequestBody AppUser user) {
        AppUser updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}