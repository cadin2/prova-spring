package com.prova.prova;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long>{
    //JpaRepository estão presentes na interface
}