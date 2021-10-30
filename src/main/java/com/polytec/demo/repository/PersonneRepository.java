package com.polytec.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytec.demo.entity.Personne;

import java.util.Collection;

@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {

    public Personne getPersonneByCin(String cin);

    public Collection<Personne> findByCinIsNull();



}
