package com.datortehnika.datortehnikas_sistema.repository;

import com.datortehnika.datortehnikas_sistema.model.Tech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface techRepo extends JpaRepository<Tech, Long> {

}
