package com.datortehnika.datortehnikas_sistema.repository;

import com.datortehnika.datortehnikas_sistema.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// Repository used for query methods.
public interface requestRepo extends JpaRepository<Request, Long> {
    void deleteRequestById(Long id);
    Optional<Request> findRequestById(Long id);
}