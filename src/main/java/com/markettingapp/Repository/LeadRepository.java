package com.markettingapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.markettingapp.entities.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
