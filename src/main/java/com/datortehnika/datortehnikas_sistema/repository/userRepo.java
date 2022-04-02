package com.datortehnika.datortehnikas_sistema.repository;

import com.datortehnika.datortehnikas_sistema.appUser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

// Repository used for query methods.
@Repository
@Transactional(readOnly = true)
public interface userRepo extends JpaRepository<AppUser, Long > {
    Optional<AppUser> findByEmail(String email);
}
