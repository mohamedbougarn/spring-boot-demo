package com.polytec.demo.repository;

import com.polytec.demo.entity.Etudiant;
import com.polytec.demo.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{

    public Etudiant getEtudiantById (Long id);
    public Collection<Personne> findByIdIsNull();

}
