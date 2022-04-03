package com.datortehnika.datortehnikas_sistema.service;

import com.datortehnika.datortehnikas_sistema.exception.userNotFoundException;
import com.datortehnika.datortehnikas_sistema.model.User;
import com.datortehnika.datortehnikas_sistema.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private final userRepo userRepo;

    @Autowired
    public userService(userRepo userRepo){
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public User findUserById(Long id){
        return userRepo.findUserById(id).orElseThrow(() -> new userNotFoundException("Error: User by ID " + id + " was not found!"));
    }

    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }
}
