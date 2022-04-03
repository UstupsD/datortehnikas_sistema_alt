package com.datortehnika.datortehnikas_sistema.repository;

import com.datortehnika.datortehnikas_sistema.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// Repository used for query methods.
public interface userRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id);
    Optional<User> findUserById(Long id);

}
