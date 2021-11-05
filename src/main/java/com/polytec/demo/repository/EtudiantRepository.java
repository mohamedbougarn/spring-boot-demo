package com.polytec.demo.repository;

import com.polytec.demo.entity.Etudiant;
import com.polytec.demo.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{

   //public Etudiant add(Etudiant etudiant);
    //public Etudiant update(Etudiant etudiant);
    public void deleteById(Long id);
    //public List<Etudiant> getAll();
    public Etudiant getEtudiantById (Long id);
    public Collection<Personne> findByIdIsNull();

}
