package com.datortehnika.datortehnikas_sistema.repository;

import com.datortehnika.datortehnikas_sistema.model.Tech;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// Repository used for query methods.
public interface techRepo extends JpaRepository<Tech, Long> {
    void deleteTechById(Long id);
    Optional<Tech> findTechById(Long id);

}
